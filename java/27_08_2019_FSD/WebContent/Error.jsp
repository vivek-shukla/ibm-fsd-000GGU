<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@page import="java.util.LinkedList" %>
 <%@page import="comm.league.model.LeagueModel" %>
 <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 List<String> errorList =(LinkedList<String>)request.getAttribute("Error");
 for(String errorMsg:errorList)
 {
	out.println("<li style=\"color:red\">"+errorMsg+"</li>");
 }
 out.println("<a href=\"http://localhost:8080/27_08_2019_FSD\">Go To Homepage</a>");
%>

</body>
</html>