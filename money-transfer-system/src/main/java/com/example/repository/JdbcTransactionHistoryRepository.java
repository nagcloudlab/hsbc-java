package com.example.repository;

import com.example.db.MySqlConnectionFactory;
import com.example.model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class JdbcTransactionHistoryRepository implements TransactionHistoryRepository {

    private static Random random = new Random();

    @Override
    public void saveTransaction(Transaction transaction) {

        Connection connection = null;
        try {
            connection = MySqlConnectionFactory.getConnection();

            String sql = "INSERT INTO transactions (transaction_id, account_number, amount,transaction_type,transaction_date) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, random.nextInt(10000));
            statement.setInt(2, transaction.getAccount().getAccountNumber());
            statement.setDouble(3, transaction.getAmount());
            statement.setString(4, transaction.getTransactionType().name());
            statement.setTimestamp(5, new java.sql.Timestamp(transaction.getTransactionDate().getTime()));

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public List<Transaction> findAll() {
        return List.of();
    }
}
