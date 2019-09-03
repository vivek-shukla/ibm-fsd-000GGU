<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="cd" id="form-1" action="controller.do" method="post">
		<label for="input-1">Title:</label>
		<input id="input-1" name="title" placeholder="Text" type="text"/>
		<label for="input-2">Artist:</label>
		<input id="input-2" name="Artist" placeholder="Text" type="text"/>
		<label for="input-3">Purchase Date:</label>
		<input id="input-3" name="purchase_date" placeholder="Text" type="text"/>
		<label for="input-4">Cost:</label>
		<input id="input-4" name="cost" placeholder="Text" type="number"/>
		<select name="cd_type" id="cd_type" > 
		  <option value="CD">Normal CD</option>
		  <option value="Internation">International</option>
		   <option value="Regional">Regional</option>
		</select>
		<input type="submit" value="Submit" id="button-1"/>
		
	</form>
	

</body>
</html>