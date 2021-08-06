<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String check = (String)session.getAttribute("session_id");
	
	if (check != null) {
		response.sendRedirect("users_login_ok.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 창</title>
</head>
<body>
	<h1>로그인 창</h1>
	<form action="users_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="아이디" /><br/>
		<input type="password" name="pw" placeholder="비밀번호" /><br/><br/>
		<input type="submit" value="로그인" />&nbsp;
		<a href="users_join_form.jsp">회원가입</a>
	</form>
</body>
</html>