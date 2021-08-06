<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	request.setCharacterEncoding("utf-8");	

	//1.아이디 비밀번호 받아오기.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	String checkId = request.getParameter("id_check");
	String checkPw = request.getParameter("pw_check");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if( id.equals("abc1234") && pw.equals("aaa1111") ) {
		
		Cookie idCookie = new Cookie("user_id", id);
		idCookie.setMaxAge(1800);
		response.addCookie(idCookie);
		
		if ( checkId != null && checkId.equals("yes")) {
			Cookie checkIdCookie = new Cookie("remember_id", id);
			checkIdCookie.setMaxAge(20);
			response.addCookie(checkIdCookie);
		} else {
			
		}
		
		if ( checkPw != null && checkPw.equals("yes")) {
			Cookie checkPwCookie = new Cookie("remember_pw", pw);
			checkPwCookie.setMaxAge(20);
			response.addCookie(checkPwCookie);
		}
		
		response.sendRedirect("cookie_welcome.jsp");
	} else {
		out.println("로그인에 실패했습니다.");
	}
%>



</body>
</html>