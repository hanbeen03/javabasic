<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("updateId");
	String pw = request.getParameter("updatePw");
	String uname = request.getParameter("updateUname");
	String email = request.getParameter("updateEmail");
	
	/*
	System.out.println(id);
	System.out.println(pw);
	System.out.println(uname);
	System.out.println(email);
	*/
	
	/*
	if(pw.equals("") || uname.equals("") || email.equals("")) {
		out.println("<script>alert('빈칸을 입력하실 수 없습니다.'); history.back();</script>");
	}
	*/
	
	UsersDAO dao = UsersDAO.getInstance();
	UsersVO user = new UsersVO(id, pw, uname, email);
	
	int check = dao.updateUsers(user);
	
	if(check == 1) { %>
		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= id %>님의 회원정보 수정이 완료되었습니다.</h1>
	<a href="users_login_form.jsp">로그인창으로 돌아가기</a>
</body>
</html>

<%	} else if (check == 0) {
		response.sendRedirect("users_update_fail.jsp");
	}
	
%>