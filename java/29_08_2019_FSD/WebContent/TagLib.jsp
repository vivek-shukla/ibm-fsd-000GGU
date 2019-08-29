 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Hell There what is your name?</h4>
<form id="form-1" method="post">
	<label for="input-1">Enter Name:</label>
	<input id="input-1" name="name" required="true" type="text"/>
	<br/>
	<input type="submit" value="Submit" id="button-1"/>
</form>
<c:if test="${fn:length(param.name)>0}">
 <c:out value="${param.name}">Hello ${param.name}</c:out>
 <c:redirect url="Index.jsp"></c:redirect>
 <c:import url="java.util.Date"> </c:import>
</c:if>

</body>
</html>