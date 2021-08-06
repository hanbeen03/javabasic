<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글 데이터가 POST 전송시 깨지지 않도록 처리
	request.setCharacterEncoding("utf-8");


	//폼에서 던진 데이터를 받기 위해서는 request.getParameter("name값")
	//을 활용합니다.
	//name="apple" 에서 던져진 데이터를 받기 위해서는
	String id = request.getParameter("id");
	//name="banana" 에서 던져진 데이터를 받기 위해서는
	String pw = request.getParameter("pw");
	String intro = request.getParameter("intro");
	//String hobby = request.getParameter("hobby");
	// 체크박스는 복수의 데이터가 넘어올 수 있기 때문에
	// request.getParameterValues("name명")를 사용합니다.
	String[] hobby = request.getParameterValues("hobby");
	String[] act = request.getParameterValues("activity");
	
	String gender = request.getParameter("gender");
	String grade = request.getParameter("grade");
	
	String region = request.getParameter("region");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <b><%= id %></b><br/>
	비밀번호 : <b><%= pw %></b><br/>
	자기소개 : <b><%= intro %></b><br/>
	취미 : <b><%= Arrays.toString(hobby) %></b><br/>
	특기 : <b><%= Arrays.toString(act) %></b>&nbsp;
	특기 :
	<% for(String a : act) { %>
		<b><%= a %></b>&nbsp;
	<% } %>
	
	<br/>
	
	성별 : <b><%= gender %></b><br/>
	학년 : <b><%= grade %></b><br/>
	지역 : <b><%= region %></b><br/>
	<%-- 취미 :
	<% for(String name : hobby) { %>
		<b><%= name %></b>&nbsp;
	<% } %>
	--%>
	
	<%-- 취미 : <b><%= hobby %></b><br/> --%>
</body>
</html>