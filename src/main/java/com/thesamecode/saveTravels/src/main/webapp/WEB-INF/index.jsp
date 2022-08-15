<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Expenses Page</title>
</head>
<body>
<h1>All Expenses</h1>
	<Table class="table">
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
			<th>Actions</th>
		</tr>
		<tr>
			<c:forEach var="expense" items="${expenses}">
			<tr>
			<td><a href="/expenses/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
			<td><c:out value="${expense.vendor}"></c:out></td>	
			<td>$<fmt:formatNumber type="Number" minFractionDigits="2" value="${expense.amount}"/></td>
			<td><a href="/expenses/${expense.id}/edit">edit</a></td>
			<td>
				<form action="/expenses/${expense.id}" method="post">
    				<input type="hidden" name="_method" value="delete">
    				<input type="submit" value="Delete">
				</form>
			</td>
			</tr>
			</c:forEach>
		</tr>
	</Table>
	<h2>Add an expense:</h2>
	<form:form action="/expenses" method="post" modelAttribute="expense">
		<div>
			<form:label path="name">Expense Name:</form:label>
			<form:errors path="name" class="text-danger" />
			<form:input path="name"/>
		</div>
		<div>
			<form:label path="vendor">Vendor:</form:label>
			<form:errors path="vendor" class="text-danger" />
			<form:textarea path="vendor"/>
		</div>
		<div>
			<form:label path="amount">Amount:</form:label>
			<form:errors path="amount" class="text-danger" />
			<form:input type="double" path="amount"/>
		</div>
		<div>
			<form:label path="description">Description:</form:label>
			<form:errors path="description" class="text-danger" />
			<form:input path="description"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>