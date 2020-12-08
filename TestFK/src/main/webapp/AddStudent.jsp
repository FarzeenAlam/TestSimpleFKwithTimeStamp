<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>

<form action="addStudent" method="post">
	<fieldset>
	<legend>Add a record</legend>
	<label>Enter the id:</label><br>
	<input type = "number" name="StudentId" required><br>
	<label>Enter the name:</label><br>
	<input type = "text" name="StudentName" required><br>
	<input type = "submit" value="Add"><br>
	</fieldset>
	</form>

</body>
</html>