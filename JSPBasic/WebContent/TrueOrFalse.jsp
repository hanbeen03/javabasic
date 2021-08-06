<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		public static final int a = 1;
		public static final int b = 5;
		
		public boolean TrueOrFalse(int a, int b) {
			if( a >= b )
				return true;
			else
				return false;
		}
	%>
	<%
		out.println("스크립트릿으로 출력된 값 : <b>" + TrueOrFalse(a, b) + "</b><br>");
	%>
	표현식으로 출력된 값 : <b><%= TrueOrFalse(a, b) %></b><br>

</body>
</html>