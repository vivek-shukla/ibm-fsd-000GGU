<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@page isELIgnored="false" %>

<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	<form:form action="/logout">
	
	<input type="submit" value="Submit">
	
	</form:form>
	
	Welcome to the luv2code company home page!
  <a href="login?logout"> Logout </a>
</body>

</html>