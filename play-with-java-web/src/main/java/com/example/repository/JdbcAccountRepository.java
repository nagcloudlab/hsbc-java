package com.example.repository;

import com.example.db.MySqlConnectionFactory;
import com.example.exception.DatabaseException;
import com.example.model.Account;

import java.sql.*; // JDBC Api

public class JdbcAccountRepository implements AccountRepository {

    @Override
    public Account findAccount(int accountNumber) {
        Connection connection = null;
        try {
            connection = MySqlConnectionFactory.getConnection();

            String sql = "SELECT * FROM accounts WHERE account_number = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, accountNumber);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Account account = new Account();
                account.setAccountNumber(resultSet.getInt("account_number"));
                account.setBalance(resultSet.getDouble("balance"));
                return account;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DatabaseException("Error while fetching account details");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public void updateAccount(Account account) {

        Connection connection = null;
        try {
            connection = MySqlConnectionFactory.getConnection();

            String sql = "UPDATE accounts SET balance = ? WHERE account_number = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, account.getBalance());
            statement.setInt(2, account.getAccountNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DatabaseException("Error while updating account details");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
