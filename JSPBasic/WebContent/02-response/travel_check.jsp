<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	

	String city = request.getParameter("city");

	if (city.equals("뉴욕")) {
		response.sendRedirect("travel_newyork.jsp");
	} else if(city.equals("파리")) {
		response.sendRedirect("travel_paris.jsp");
	} else if(city.equals("하와이")) {
		response.sendRedirect("travel_hawaii.jsp");
	} else if(city.equals("제주도")) {
		response.sendRedirect("travel_jeju.jsp");
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>