<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%

	String idCheck = (String)session.getAttribute("session_id");

	if(idCheck == null) {
		session.invalidate();
		response.sendRedirect("users_login_form.jsp");
	}
	//DB에서 전체 회원 데이터를 들고 나옵니다.
	//1.getAllUser()메서드를 dao를 이용해 호출합니다.
	UsersDAO dao = UsersDAO.getInstance();
	ArrayList<UsersVO> users = new ArrayList<>();  
	
	users = dao.getAllUser();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 회원 목록</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>회원 아이디</th>
				<th>회원 이름</th>
				<th>회원 이메일</th>				
			</tr>
		</thead>
		<tbody>
		<%--
			<% for(UsersVO user : users) { %>
				<tr>
					<td><%= user.getId() %></td>
					<td><%= user.getUname() %></td>
					<td><%= user.getEmail() %></td>
				</tr>				
			<% } %>
		--%>
		<c:forEach var="user" items="<%= users %>">
			<tr>
				<td>${user.id }</td>
				<td>${user.uname }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>