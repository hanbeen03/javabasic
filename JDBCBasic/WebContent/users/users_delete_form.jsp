<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("session_id");

	if ( id == null) {
		response.sendRedirect("users_login_form.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%= id %>님의 회원 탈퇴를 진행합니다.<br/>
		비밀번호를 한 번 더 입력해 주세요.
	</h3>
	<form action="users_delete_ok.jsp" method="post">
		<input type="password" name="deletePw" placeholder="비밀번호 재입력" /><br/>
		<input type="submit" value="탈퇴" />
	</form>
</body>
</html>