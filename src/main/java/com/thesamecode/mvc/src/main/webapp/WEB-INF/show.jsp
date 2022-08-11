<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Book</title>
</head>
<body>
	<h1>${book.title}</h1>
	<p><strong>Description: </strong>${book.description}</p>
	<p><strong>Language: </strong>${book.language}</p>
	<p><strong>Number of Pages: </strong>${book.numberOfPages}</p>
</body>
</html>