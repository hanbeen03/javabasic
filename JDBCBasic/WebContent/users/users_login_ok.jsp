<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// DB연결로직을 집어넣어주세요.
	String check = (String)session.getAttribute("session_id");
	
	if( check != null) {
		id = check;
	} else {
		UsersDAO dao = UsersDAO.getInstance();
		
		UsersVO user = new UsersVO();
		user.setId(id);
		user.setPw(pw);
		
		//int login_check = dao.loginUsers(user, id, pw);
		int login_check = dao.loginUsers(user);
			
		//System.out.println(check2);
		
		if(login_check == 1) {
			session.setAttribute("session_id", id);
			session.setAttribute("session_pw", pw);
			//out.println("<h1>" + id + "님 환영합니다! </h1>");
		} else if(login_check == 0){
			response.sendRedirect("users_login_fail.jsp");
		}
			
			//System.out.println("조회된 아이디 : " + compareId);
		//	System.out.println("조회된 비밀번호 : " + comparePw);
	}
	
	
	/*
	if( id.equals(compareId) && pw.equals(comparePw)) {
		session.setAttribute("session_id", id);
		out.println("<h1>" + id + "님 환영합니다! </h1>");
	} else {
		response.sendRedirect("users_login_fail.jsp");
	}
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= id %>님 환영합니다!</h1>
	<a href="users_logout.jsp">로그아웃하기</a>&nbsp;
	<a href="users_delete_form.jsp">회원 탈퇴하기</a>&nbsp;
	<a href="users_update_form.jsp">회원정보 수정하기</a><br/>
	<a href="users_get_all.jsp">회원 목록 보기</a>&nbsp;
</body>
</html>