package com.example;

import com.example.db.MySqlConnectionFactory;
import com.example.repository.AccountRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AtomicTransactionEx {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = MySqlConnectionFactory.getConnection();
            connection.setAutoCommit(false);

            // step-1: Insert account-3
            String sql1 = "INSERT INTO accounts (account_number, balance) VALUES (3, 3000)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql1);

            if (false)
                throw new RuntimeException("Simulate runtime exception");

            // step-2: Insert account-4
            String sql2 = "INSERT INTO accounts (account_number, balance) VALUES (4, 4000)";
            Statement statement2 = connection.createStatement();
            statement2.executeUpdate(sql2);

            connection.commit();


        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


}
