<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" modelAttribute="st" >

Name: <form:input path="name"/>
Email: <form:input path="email"/>
<br/>
Country <form:select path="cInstance">
   <form:options items="${st.country}"/>
 </form:select>
<br/>
Favourite Language : <br>

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
Haskel <form:radiobutton path="favoriteLanguage" value="Haskel"/>

<br>
Operating System : <br>

Fedora <form:checkbox path="operatingSystems" value="Fedora"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>

<br><br>
<input type="submit" value="Submit">

</form:form>

</body>
</html>