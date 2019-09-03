<%@page import="Entity.Instructor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello world
<form name="intructor" id="form-1" action="instructorDetail.jsp" method="post">
	<label for="input-1">First Name:</label>
	<input id="input-1" name="fName" type="text"/>
	<label for="input-2">Last Name:</label>
	<input id="input-2" name="lName" type="text"/>
	<label for="input-3">Email:</label>
	<input id="input-3" name="email" type="text"/>
<%
String fName = (String)request.getAttribute("fName");
String lName = (String)request.getAttribute("lName");
String email  = (String)request.getAttribute("email");
 Instructor intstructor = new Instructor(fName,lName,email);
 request.setAttribute("Instructor", intstructor);
%>
	
	<input type="submit" value="Submit" id="button-1"/>
	
</form>
</body>
</html>