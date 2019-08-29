<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@page import="comm.league.model.LeagueModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
LeagueModel lm =(LeagueModel)request.getAttribute("SUCCESS");
out.println("<li>"+lm.getTitle() +"</li>"+ "<li>"+lm.getYear() +"</li>" + "<li>"+lm.getSport() +"</li>");

out.println("League added");
%>

</body>
</html>