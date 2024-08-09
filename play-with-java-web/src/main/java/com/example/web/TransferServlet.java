package com.example.web;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JdbcTransactionHistoryRepository;
import com.example.repository.TransactionHistoryRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/transfer")
public class TransferServlet extends HttpServlet {

    TransactionHistoryRepository transactionHistoryRepository = new JdbcTransactionHistoryRepository();
    AccountRepository accountRepository = new JdbcAccountRepository();
    TransferService transferService = new UPITransferService(accountRepository, transactionHistoryRepository);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // read the request parameters

        int fromAccountNumber = Integer.parseInt(req.getParameter("fromAccountNumber"));
        int toAccountNumber = Integer.parseInt(req.getParameter("toAccountNumber"));
        double amount = Double.parseDouble(req.getParameter("amount"));

        // process the request
        transferService.transfer(fromAccountNumber, toAccountNumber, amount);

        // generate the response
        req.getRequestDispatcher("/transfer-response.jsp").forward(req, resp);


    }
}
