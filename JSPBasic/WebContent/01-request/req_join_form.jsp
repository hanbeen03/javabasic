<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h2>회원가입 양식</h2>
	<form action="req_join.jsp" method="post">
		아이디 : 
		<input type="text" name=joinId /><br/>
		비밀번호 :
		<input type="password" name=joinPw /><br/>
		
		<input type="submit" value="회원가입" /> &nbsp;
		<input type="reset" value="초기화" />
	</form>
</body>
</html>