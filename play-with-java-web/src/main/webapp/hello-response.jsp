<!DOCTYPE html>
<%@ page import="java.time.LocalDateTime" %>
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

Time Now : <%=LocalDateTime.now()  %>

<div class="alert alert-info">
    <%=request.getAttribute("message") %>
</div>


</body>
</html>