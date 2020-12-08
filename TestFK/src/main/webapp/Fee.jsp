<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Fee" method="post">
	<fieldset>
	<legend>Add a record</legend>
	<label>Enter the fee id:</label><br>
	<input type = "number" name="FeeId" required><br>
	<label>Enter the amount:</label><br>
	<input type = "number" name="amount" required><br>
	<label>Enter the transaction type:</label><br>
	<input type = "text" name="TransactionType" required><br>
	<label>Enter the student id:</label><br>
	<input type = "number" name="student" required><br>
	<input type = "submit" value="Add"><br>
	</fieldset>
	</form>

</body>
</html>