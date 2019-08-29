<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="comm.league.model.LeagueModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
 <c:if test="${Error!=null}">
    <c:forEach items="${Error}" var="errorMsg">
    ${errorMsg}
  </c:forEach>
  </c:if>
  
<form action="addLeague.do"> 
    <label class="form-label" for="title">league Title </label>
    <input class="form-control" type="text" name = "title" id="title" placeholder="Enter League title">
    <label class="form-label" for="year">Enter Year </label>
    <input class="form-control" type="text" name = "year" id="year" placeholder="Enter year">
    <select class="form-control" name="sport">
       <option value="Unknown">Select...</option>
       <option value="Cricket">Cricket</option>
       <option value="Football">Football</option>
       <option value="Soccer">Soccer</option>  
    </select>
    <input class="btn btn-primary" type="Submit" value="Submit"> 
  </form>
  <form action="viewLeague.do">
     <input class="btn btn-primary" type="submit" name="viewLeague" value="View League"/>
  </form>
  
  

</body>
</html>