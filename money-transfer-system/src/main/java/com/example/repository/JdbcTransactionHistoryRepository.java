package com.example.repository;

import com.example.db.MySqlConnectionFactory;
import com.example.model.Account;
import com.example.model.Transaction;
import com.example.model.TransactionType;

import java.sql.*;
import java.util.ArrayList;
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

        List<Transaction> transactions = new ArrayList<>();
        Connection connection = null;
        try {
            connection = MySqlConnectionFactory.getConnection();


            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM transactions";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Account account = new Account();
                account.setAccountNumber(resultSet.getInt("account_number"));

                Transaction transaction = new Transaction();
                transaction.setTransactionId(resultSet.getInt("transaction_id"));
                transaction.setAccount(account);
                transaction.setAmount(resultSet.getDouble("amount"));
                transaction.setTransactionType(TransactionType.valueOf(resultSet.getString("transaction_type")));
                transaction.setTransactionDate(resultSet.getTimestamp("transaction_date"));

                // Add transaction to list
                transactions.add(transaction);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return transactions;

    }
}
