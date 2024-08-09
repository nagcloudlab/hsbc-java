package com.example.web;

import com.example.model.Transaction;
import com.example.repository.JdbcTransactionHistoryRepository;
import com.example.repository.TransactionHistoryRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/statement")
public class StatementServlet extends HttpServlet {

    private TransactionHistoryRepository transactionHistoryRepository = new JdbcTransactionHistoryRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Transaction> transactions=transactionHistoryRepository.findAll();
        req.setAttribute("transactions", transactions);
        req.getRequestDispatcher("/statement.jsp").forward(req, resp);
    }
}
