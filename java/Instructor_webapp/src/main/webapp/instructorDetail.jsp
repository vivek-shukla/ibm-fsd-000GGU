<%@page import="Entity.Instructor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String fName = (String)request.getAttribute("fName");
String lName = (String)request.getAttribute("lName");
String email  = (String)request.getAttribute("email");
 Instructor instructor =  new Instructor(fName,lName,email);
 HttpSession sess = request.getSession();
 sess.setAttribute("Instructor", instructor);
%>
<body>
	<form name="detail" id="form-1" action="controller.do">
		<label for="input-1">Youtube Channel:</label>
		<input id="input-1" name="youtubeChannel" type="text"/>
		<label for="input-2">Hobby:</label>
		<input id="input-2" name="hobby" placeholder="Text" type="text"/>
		<input type="submit" value="Save Instrctor" id="button-1"/>
	</form>
</body>
</html>