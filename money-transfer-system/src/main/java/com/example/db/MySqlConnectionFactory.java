package com.example.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnectionFactory {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("/Users/nag/hsbc-java/money-transfer-system/src/main/resources/db.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        // step-1 : Load Driver
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //Class.forName("com.mysql.cj.jdbc.Driver");
        // step-2 : Create Connection
        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String password = properties.getProperty("db.password");
        return DriverManager.getConnection(url, user, password);
    }

}
