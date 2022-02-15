<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>회원 검색창</title>
</head>
<body>
   <form method="post" action="member.jsp">
	   이름:<input type="text" name="name"><br>
	   <input type ="submit" value="조회하기">
   </form>
   
   <form method="post" action="member2.jsp">
	   비밀번호:<input type="text" name="pwd"><br>
	   <input type ="submit" value="조회하기">
   </form>
</body>
</html>

