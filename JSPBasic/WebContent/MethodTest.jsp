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
		public double Celcius = 33.0;
		
		public double CtoF(double celcius) {
			return (celcius * 1.8) + 32;
		}
	%>
	<%
		out.println("<h2>오늘 현재 홍대입구의 온도</h2>");
		out.println("섭씨 온도 : " + "<b>" + Celcius + "</b><br>");
		out.println("화씨 온도 : " + "<b>" + CtoF(Celcius) + "</b><br>");
	%>
</body>
</html>