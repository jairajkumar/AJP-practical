<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1>Welcome to JSP</h1>
	<br>
	<% String n=request.getParameter("un"); 
	int no=Integer.parseInt(n); 
	out.println("number entered is : " + no); 
	out.println(" <br> <br>"); 
	out.println("Cube of Number: " + no*no*no);
            %>
</body>

</html>