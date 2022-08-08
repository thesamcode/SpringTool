<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Fruity Loops JSP</title>
    </head>
<body>

    <h1>Fruit of the Day</h1>
	<h2><c:out value="${fruit}"/></h2>
	<Table class="table">
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<tr>
			<td><c:out value="${fruit1.name}"/></td>
			<td><c:out value="${fruit1.price}"/></td>
		</tr>
		<tr>
			<td><c:out value="${fruit2.name}"/></td>
			<td><c:out value="${fruit2.price}"/></td>
		</tr>
		<tr>
			<td><c:out value="${fruit3.name}"/></td>
			<td><c:out value="${fruit3.price}"/></td>
		</tr>
		<tr>
			<td><c:out value="${fruit4.name}"/></td>
			<td><c:out value="${fruit4.price}"/></td>
		</tr>
	</Table>

    
</body>
</html>
