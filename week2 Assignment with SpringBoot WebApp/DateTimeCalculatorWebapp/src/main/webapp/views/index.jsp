<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to Sapient's DateTimeCalculator App

	<form action="/solve">
 		Enter Date : <input type="text" name="date"><br>
 		Enter Phrase : <input type="text" name="Function"><br>
 		<input type="submit">
 	</form>
 	
 	${date} : ${Function}  =  ${result}
 	
 	
 	<p>by - Divyansh Jain</p>
</body>
</html>