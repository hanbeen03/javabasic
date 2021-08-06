<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginId = request.getParameter("loginId");
	String loginPw = request.getParameter("loginPw");
%>

<!DOCTYPE html>
<html>

<% if (!(loginId.equals("abcd"))) { %>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>
		로그인에 실패하셨습니다.<br>
		아이디가 없습니다.<br>
	</b>
	<a href="req_login_form.jsp">로그인창으로 돌아가기</a>
</body>

<% } else if (!(loginPw.equals("1234"))) { %>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>
		로그인에 실패하셨습니다.<br>
		비밀번호가 다릅니다.<br>
	</b>
	<a href="req_login_form.jsp">로그인창으로 돌아가기</a>
</body>

<% } else { %>

<head>
<meta charset="UTF-8">
<title>로그인 성공!</title>
</head>
<body>
	<p>
		<b><%= loginId %></b>님 환영합니다.
	</p>
</body>

<% } %>

</html>



