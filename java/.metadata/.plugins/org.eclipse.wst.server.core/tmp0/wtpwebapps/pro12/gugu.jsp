<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%int dan= Integer.parseInt(request.getParameter("dan")); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력창</title>
</head>
<body>
	<% for(int i=1;i<=9;i++){%>
	<h1><%=dan%>×<%=i %>=<%=i*dan%></h1>
	<%} %>
</body>
</html>