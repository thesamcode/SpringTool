<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
</head>
<body>
	<h1>Expense Details</h1>
	<p><a href="/expenses">Go back</a></p>
	<p><strong>Expense Name: </strong>${expense.name}</p>
	<p><strong>Expense Description: </strong>${expense.description}</p>
	<p><strong>Vendor: </strong>${expense.vendor}</p>
	<p><strong>Amount Spent: </strong>$${expense.amount}</p>
</body>
</html>