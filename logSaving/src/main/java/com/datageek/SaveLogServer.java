package com.datageek;

import kafka.serializer.StringDecoder;
import org.apache.commons.cli.*;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.hive.HiveContext;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import util.MysqlDao;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class SaveLogServer implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(SaveLogClient.class);
    private static boolean config_db = true;
    //private static boolean use_es = false;

    public static void main(String[] args) throws Exception {
        Options opt = new Options();
        //opt.addOption("d", "dry-run", false, "whether execute this process with dry_run");
        opt.addOption("k", "kafka-topic", true, "the topic of kafka");
        opt.addOption("b", "kafka-brokers", true, "the brokers list of kafka");
        opt.addOption("s", "source type", true, "the device type of log");
        opt.addOption("t", "table name", true, "the table name used for saving");
        opt.addOption("u", "use-config-file", false, "whether read all configures from file");
        opt.addOption("h", "help", false, "help message");
        //opt.addOption("f", "json-file", true, "the json file which contains patterns");
        //opt.addOption("e", "use-esdao", false, "whether use esdao to save");

        //boolean dryRun = false;
        String topicName = "";
        String brokers = "";
        String sourceName = "";
        String tableName = "";

        String formatstr = "sh run.sh yarn-cluster|yarn-client|local [-d/--dryrun] -k/--kafkatopic <topicvalue> -b/--kafkabrokers <brokersvalue> -t/--type <logtype> -f/--jsonfile <jsonfilename>";

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new PosixParser();
        CommandLine cl = null;
        try {
            cl = parser.parse(opt, args);
        } catch (org.apache.commons.cli.ParseException e) {
            formatter.printHelp(formatstr, opt);
            System.exit(1);
        }
        if (cl.hasOption("h")) {
            formatter.printHelp(formatstr, opt);
            System.exit(0);
        }
        if (cl.hasOption("t")) {
            tableName = cl.getOptionValue("t");
        }
        if (cl.hasOption("u")) {
            config_db = false;
        }
        if (cl.hasOption("k")) {
            topicName = cl.getOptionValue("k");
        }
        if (cl.hasOption("b")) {
            brokers = cl.getOptionValue("b");
        }
        if (cl.hasOption("s")) {
            sourceName = cl.getOptionValue("s");
        }
        /*
        if (cl.hasOption("f")) {
            configFilePath = cl.getOptionValue("f");
        }
        if (cl.hasOption("e")) {
            use_es = true;
        }*/

        log.info("topic name: " + topicName);
        log.info("brokers quorum: " + brokers);
        log.info("source name: " + sourceName);
        log.info("config_db: " + config_db);
        log.info("tableName: " + tableName);
        /*log.info("dryRun: " + dryRun);
        log.info("config file path: " + configFilePath);
        log.info("use_es: " + use_es);*/

        process(topicName, brokers, sourceName, tableName);
    }

    private static void process(String topicName, String brokers, String sourceName, String tableName)
            throws IllegalArgumentException, IOException {
        String CONSUMER_GROUP_ID = "SaveLogKafka";
        SparkConf sparkConf = new SparkConf().setAppName(CONSUMER_GROUP_ID + "[" + sourceName + "]");
        sparkConf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer");

        Map<String, Integer> topicMap = new HashMap<>();
        topicMap.put(topicName, 1);

        JavaStreamingContext ssc = new JavaStreamingContext(sparkConf, new Duration(5000));

        HiveContext hContext = new HiveContext(ssc.sparkContext());
        hContext.setConf("hive.server2.thrift.port", "10000");

        Set<String> topicsSet = new HashSet<>(Arrays.asList(topicName.split(",")));
        Map<String, String> kafkaParams = new HashMap<>();
        kafkaParams.put("metadata.broker.list", brokers);

        JavaPairInputDStream<String, String> messages = KafkaUtils.createDirectStream(
                ssc, String.class, String.class, StringDecoder.class, StringDecoder.class,
                kafkaParams, topicsSet);

        JavaDStream<String> lines = messages.map(line -> line._2);

        JavaDStream<String> filter = lines.filter(line -> line.contains("{"));

        filter.foreachRDD(json->{
            if(json.count()>0){
                DataFrame df = hContext.read().json(json);
                saveToMysql(hContext, df, tableName);
            }else{
                log.info("#######################Nothing received from kafka... ");
            }
        });

        ssc.start();
        ssc.awaitTermination();
    }

    private static void saveToMysql(HiveContext hContext, DataFrame df, String tableName) {
        log.info("#######################saveToMysql is starting.....");
        log.info("#######################table name = " + tableName);
        MysqlDao mysqlDao = new MysqlDao(config_db);
        mysqlDao.save(hContext, df, tableName);
        log.info("#######################saveToMysql is finished.....");
    }
}