<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Book</title>
</head>
<body>
	<h1>New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
		<div>
			<form:label path="title">Title</form:label>
			<form:errors path="title" class="text-danger" />
			<form:input path="title"/>
		</div>
		<div>
			<form:label path="description">Description</form:label>
			<form:errors path="description" class="text-danger" />
			<form:textarea path="description"/>
		</div>
		<div>
			<form:label path="language">Language</form:label>
			<form:errors path="language" class="text-danger" />
			<form:input path="language"/>
		</div>
		<div>
			<form:label path="numberOfPages">Pages</form:label>
			<form:errors path="numberOfPages" class="text-danger" />
			<form:input type="number" path="numberOfPages"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>