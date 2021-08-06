<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String getAge = request.getParameter("age");

	int age = Integer.parseInt(getAge);
%>

<%
	if(age <= 19)
		response.sendRedirect("res_no.jsp");
	else
		response.sendRedirect("res_ok.jsp");
%>