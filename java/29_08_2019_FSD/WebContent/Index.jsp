<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 out.println("Hello the date is"+new Date().getDate());
%>
<form name="frm" id="form-1" action="process.jsp" method="post">
	<label for="input-1">Enter Name:</label>
	<input id="input-1" name="name" placeholder="name" required="true" type="text"/>
	<input type="submit" value="Save Name" id="button-1"/>
</form>
<% 
String email = (String)request.getAttribute("email");
String pass = (String)request.getAttribute("pass");
if(email.length()>0)
{
	if(pass.length()>0)
	{
		
	}
	else
	{ 
		out.println("<p style=\"color:red\">Password not match</p>");
	}
}
else
{ out.println("<p style=\"color:red\">Invalid email</p>"); } 
%>
</body>
</html>