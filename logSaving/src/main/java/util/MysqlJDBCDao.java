package util;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;

public class MysqlJDBCDao {
    private ResultSet res;
    private String driverName  = "";
    private String dbUrl = "";
    private String dbUser  = "";
    private String dbPassword  = "";
    //private String configtable = "";
    private Connection conn = null;
    private Statement stmt = null;

    private static Logger log = Logger.getLogger(MysqlJDBCDao.class);

    public MysqlJDBCDao() {
        try {
            PropertiesReader.loadPropertiesByClassPath("mysql.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        driverName = "com.mysql.jdbc.Driver";
        dbUrl = PropertiesReader.getProperty("db.mysql.url");
        log.info("db.mysql.url:" + dbUrl);
        dbUser = PropertiesReader.getProperty("db.mysql.user");
        log.info("db.mysql.user:" + dbUser);
        dbPassword = PropertiesReader.getProperty("db.mysql.password");
        /*configtable = PropertiesReader.getProperty("db.mysql.configtable");
        log.info("db.mysql.configtable:" + configtable);*/

        try {
            conn = getConn();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }

    public void closeConn() throws SQLException {
        if(res != null)
            res.close();
        if(stmt != null)
            stmt.close();
        if(conn != null)
            conn.close();
    }

    private int count(ResultSet rest) throws SQLException{
        int rowCount = 0;
        while(rest.next()){
            rowCount++;
        }
        rest.beforeFirst();
        return rowCount;
    }

    public void query(String sql) throws SQLException{
        res = stmt.executeQuery(sql);
        System.out.println("query the sql is finished, get "+count(res)+" results!");
//        while (res.next()) {
//            System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t" + res.getString(4));
//        }
//        res.beforeFirst();
    }

    public HashMap<String, String> getConfig(String type) throws SQLException{
        HashMap<String, String> map = new HashMap<String, String>();
        String sql = "SELECT a.KEY_NAME, b.KEY_VALUE FROM bus_ml_config_detail b " +
                "JOIN bus_ml_config c ON c.CONFIG_NAME='" + type +
                "' AND b.CONFIG_ID = c.ID JOIN bus_ml_config_info a ON b.KEY_ID = a.ID";
        log.info("========sql========"+sql);
        res = stmt.executeQuery(sql);
        System.out.println("query the sql is finished, get "+count(res)+" results!");
        while (res.next()) {
            String key =  res.getString(1).toLowerCase().trim();
            String value = res.getString(2).trim();
            if(!value.equalsIgnoreCase("") && value != null){
                map.put(key, value);
            }
        }
        res.beforeFirst();
        return map;
    }
}
