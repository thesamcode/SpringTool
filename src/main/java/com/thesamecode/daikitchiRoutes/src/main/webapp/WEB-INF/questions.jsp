<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send an Omikuji!</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
		<form action='/omikuji/questions' method="POST">
			<div>
			<label>Pick any number from 5 to 25</label>
			</div>
			<div>
			<input type="number" name="number" min="5" max="25">
			</div>
			<div>
			<label>Enter the name of any city.</label>
			</div>
			<div>
			<input type="text" name="city">
			</div>
			<div>
			<label>Enter the name of any real person.</label>
			</div>
			<div>
			<input type="text" name="person">
			</div>
			<div>
			<label>Enter a professional endeavor or hobby.</label>
			</div>
			<div>
			<input type="text" name="hobby">
			</div>
			<div>
			<label>Enter any type of living thing.</label>
			</div>
			<div>
			<input type="text" name="thing">
			</div>
			<div>
			<label>Say something nice to someone.</label>
			</div>
			<div>
			<input type="text" name="nice">
			</div>
			<div>
			<label><em>Send and show a friend!</em></label>
			</div>
			<input type="submit" value="Send">
		</form>

</body>
</html>