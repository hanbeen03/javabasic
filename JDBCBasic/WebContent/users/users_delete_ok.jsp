<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String deletePw = request.getParameter("deletePw");
	String sessionPw = (String)session.getAttribute("session_pw");
	String sessionId = (String)session.getAttribute("session_id");
	
	
	//1. DAO를 생성하고
	UsersDAO dao = UsersDAO.getInstance();
	//2. UserVO를 생성하되, spw, sessionId만 setter로 넣어주세요.
	//UsersVO user = new UsersVO(sessionId, sessionPw, null, null);
	UsersVO user = new UsersVO();
	user.setPw(sessionPw);
	user.setId(sessionId);
	
	//3. DAO의 deleteUsers 기능을 호출하면서 파라미터로 적절한 자료를
	//넘겨주세요
	//dao.usersDelete(user, deletePw);
	int check = dao.usersDelete(user, deletePw);

	if(check == 1) {
		session.invalidate();
	} else if (check == 0) {
		session.invalidate();
		response.sendRedirect("users_login_form.jsp");
	}
	//System.out.println(check);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 탈퇴가 완료되었습니다.</h1>
	<a href="users_login_form.jsp">로그인 창으로 돌아가기</a>
</body>
</html>