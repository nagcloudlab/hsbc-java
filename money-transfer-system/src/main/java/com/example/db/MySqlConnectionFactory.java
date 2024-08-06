package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {

    public static Connection getConnection() throws SQLException {
        // step-1 : Load Driver
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //Class.forName("com.mysql.cj.jdbc.Driver");
        // step-2 : Create Connection
        String url = "jdbc:mysql://localhost:3306/money_transfer_system";
        String user = "root";
        String password = "root1234";
        return DriverManager.getConnection(url, user, password);
    }

}
