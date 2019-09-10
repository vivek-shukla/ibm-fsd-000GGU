<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="saveCustomer" modelAttribute="customerObj">
First Name <form:input path="firstName"/>
Last Name<form:input path="lastName"/>
Email <form:input path="email"/>
<form:input path="id"/>
<input type="submit" value="Submit">
</form:form>

<a href="listCustomer"> <input type="button" value="List Customer"> </a>
<a href="searchCustomer"> <input type="button" value="Search Customer"> </a>

</body>
</html>