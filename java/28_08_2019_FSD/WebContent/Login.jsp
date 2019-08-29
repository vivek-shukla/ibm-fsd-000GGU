<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<c:if test="${em.equals(\"invalid\")}"> 
 <% out.println("<p style=\"color:red\">Email not match</p>"); %>
</c:if>
<c:if test="${em.equals(\"verified\") && pass.equals(\"invalid\")}">
<% out.println("<p style=\"color:red\">Password not match</p>"); %>
 
</c:if> 
<c:if test="${em.equals(\"verified\") && pass.equals(\"verified\")}">
 <jsp:useBean id="employeeObj" class="comm.model.EmployeeModel" scope="request">
 <jsp:setProperty property="email" name="employeeObj" param="email"/>
 <jsp:setProperty property="password" name="employeeObj" param="password"/>
 <h1> <jsp:getProperty property="password" name="employeeObj" /> </h1>
 </jsp:useBean>
 
</c:if>
 <form name="Employee" id="form-1" action="Login" method="post">
	<label for="email">Email:</label>
	<input class="form-control" id="email" name="email" placeholder="abc@ef.com" type="email"/>
	<label  for="password">Password:</label>
	<input class="form-control" id="password" name="password" required="true" type="password"/>
	<input id="submit" class="btn btn-primary" name="submit" type="submit" value="LogIn"/>
</form>

 
</body>
</html>