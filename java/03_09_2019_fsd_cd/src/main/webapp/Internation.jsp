<%@page import="com.Entity.CDEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="international" id="form-1" action="controller2.do">
		<label for="input-1">Language:</label>
		<input id="input-1" name="Language" placeholder="Text" type="text"/>
		<label for="input-2">Region:</label>
		<input id="input-2" name="Region" placeholder="Text" type="text"/>
<% 
CDEntity cdObj = (CDEntity)request.getAttribute("obj");
request.setAttribute("obj", cdObj);
%>		
		<input type="submit" value="Save International CD" id="button-1" formmethod="post"/>
	</form>
</body>
</html>