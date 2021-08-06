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
		public String name = "김철수";
		public int age = 20;
		
		public double line = 5;
		
		public double areaCircle(double line) {
			return (line * line * Math.PI);
		}
	%>
	<%
		out.println("이름 : " + name + "<br/>");
		out.println("나이 : " + age + "<br/>");
	%>
	이름 : <%= name %><br/>
	나이 : <%= age %><br/>
	반지름 : <%= line %><br/>
	원넓이 : <%= areaCircle(line) %><br/>
	
</body>
</html>