<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${tempStudent.name}


${tempStudent.email}

${tempStudent.cInstance}

${tempStudent.favoriteLanguage}

<c:forEach items="${tempStudent.operatingSystems}" var="item"> 
 
 <li> <c:out value="${item}"></c:out>
 </c:forEach>

</body>
</html>