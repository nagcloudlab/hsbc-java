<!DOCTYPE html>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Transaction" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="container">

<h1 class="display-1">Money Transfer System</h1>
<hr/>


<ul class="nav nav-pills">
    <li class="nav-item">
        <a class="nav-link" href="hello">Hello</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="transfer-form.html">Transfer</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="statement">Statement</a>
    </li>
</ul>
<hr/>

<h2>Statement</h2>

<table class="table table-bordered">
    <thead>
        <tr>
        <th>Transaction ID</th>
        <th>Amount</th>
        <th>Transaction Type</th>
        <th>Transaction Date</th>
        <th>Account Number</th>
        </tr>
    </thead>
    <tbody>
        <%
        List<Transaction> transactions = (List<Transaction>) request.getAttribute("transactions");
        for (Transaction transaction : transactions) {
        %>
        <tr>
        <td><%=transaction.getTransactionId()%></td>
        <td><%=transaction.getAmount()%></td>
        <td><%=transaction.getTransactionType()%></td>
        <td><%=transaction.getTransactionDate()%></td>
        <td><%=transaction.getAccount().getAccountNumber()%></td>
        </tr>
        <%}%>
    </tbody>
</table>

</body>
</html>