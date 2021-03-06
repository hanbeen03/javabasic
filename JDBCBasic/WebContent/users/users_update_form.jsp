<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("session_id");
	
	if(id == null) {
		response.sendRedirect("users_login_form.jsp");
	}
	//만약 로그인 상태가 아니면 로그인창으로 리다이렉트 합니다.
	//dao를 통해 UsersVO를 가지고 와야 합니다.
	//들고온 UsersVO를 이용해 아래 html태그의 value속성에 표현식을 이용해
	//UserVO의 아이디, 이름, 이메일을 기입하게 만들어줍니다.
	UsersDAO dao = UsersDAO.getInstance();
	UsersVO userForGet = new UsersVO();
	userForGet.setId(id);
	
	userForGet = dao.getUserInfo(userForGet);
	
	//if(userForGet == null) {
	if(userForGet.getId() == null) {
		session.invalidate();
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
	<h1>회원정보 수정 창</h1>
	<form action="users_update_ok.jsp" method="post">
		<input type="text" name="updateId" placeholder="아이디" value="<%= userForGet.getId() %>" readonly required /><br/>
		<input type="password" name="updatePw" placeholder="비밀번호" required /><br/>
		<input type="text" name="updateUname" placeholder="성명" value="<%= userForGet.getUname() %>" required /><br/>
		<input type="email" name="updateEmail" placeholder="이메일주소" value="<%= userForGet.getEmail() %>" /><br/>
		<input type="submit" value="수정" />&nbsp;
		<a href="users_login_ok.jsp">뒤로가기</a>
		
	</form>
</body>
</html>