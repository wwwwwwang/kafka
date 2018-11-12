package util;

import org.apache.log4j.Logger;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.hive.HiveContext;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;

public class MysqlDao {

	private static final long serialVersionUID = -5238234425458222963L;
	private static Logger log = Logger.getLogger(MysqlDao.class);
	//public boolean isUsingConfigFile = false;
	protected String dbUrl = "";
	protected String dbUser  = "";
	protected String dbPassword  = "";
	protected Properties connectionProperties  = null;

	public MysqlDao(boolean isUsingConfigFile) {
		super();
		if (true == isUsingConfigFile) {
			try {
				PropertiesReader.loadPropertiesByClassPath("conn.properties");
			} catch (IOException e) {
				e.printStackTrace();
			}
			dbUrl = PropertiesReader.getProperty("db.mysql.url");
			dbUser = PropertiesReader.getProperty("db.mysql.user");
			dbPassword = PropertiesReader.getProperty("db.mysql.password");
		} else {
			MysqlJDBCDao mysqljdbcDao = new MysqlJDBCDao();
			try {
				HashMap<String, String> mysql = mysqljdbcDao.getConfig("mysqldao");
				dbUrl = mysql.get("db.mysql.url");
				dbUser = mysql.get("db.mysql.user");
				dbPassword = mysql.get("db.mysql.password");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		log.info("db.mysql.url:" + dbUrl);
		log.info("db.mysql.user:" + dbUser);
		connectionProperties = new Properties();
		connectionProperties.put("user", dbUser);
		connectionProperties.put("password", dbPassword);
	}

	public void save(HiveContext hContext, DataFrame df, String tableName){
		save(hContext, df, tableName, "append");
	}

	public void save(HiveContext hContext, DataFrame df, String tableName, String mode){
		String modeString = "append";
		if(mode.equalsIgnoreCase("overwrite")
				||mode.equalsIgnoreCase("ignore")
				||mode.equalsIgnoreCase("error")){
			modeString = mode;
		}
		try {
			df.write().mode(modeString).jdbc(dbUrl, tableName, connectionProperties);
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

}