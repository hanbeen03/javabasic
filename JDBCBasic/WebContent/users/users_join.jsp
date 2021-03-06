<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	// DB연동 이전에 먼저 users_join_form에서 날려주는 데이터를
	// 받아서 저장해줍니다.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");

	UsersDAO dao = UsersDAO.getInstance();
	
	//VO객체 생성 및 id, pw, uname, email setter로 입력해주기
	UsersVO user = new UsersVO(id, pw, uname, email);
	
	dao.joinUsers(user);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	<h1>회원가입을 축하합니다!</h1>
	<a href="users_login_form.jsp">로그인 창으로 가기</a>
</body>
</html>