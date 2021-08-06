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
		public int request = 1;

		public int getRequest() {
			return request++;
		}
		
		public int luckyNum() {
			return (int)((Math.random() * 10) + 1); 
		}
		
		public String luckyColor() {
			if(Math.random() >= 0.66)
				return "빨강";
			else if(Math.random() >= 0.33)
				return "노랑";
			else
				return "파랑";
		}
	%>
	<%
		int iRequest = 1;
		out.println("<h2>Web프로그래밍</h2>");
		out.println("페이지 누적 요청수 : " + getRequest() 
				+ ", 페이지 개별 요청수 : " + iRequest);
		
		out.println("<h3>오늘의 행운의 숫자와 행운의 색깔</h3>");
		out.println("행운의 숫자 : <b>" + luckyNum() + "</b><br>");
		out.println("행운의 색깔 : <i>" + luckyColor() + "</i><br>");
		
	%>
</body>
</html>