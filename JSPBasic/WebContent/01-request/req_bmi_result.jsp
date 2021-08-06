<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	
	double h = (Integer.parseInt(height)) / 100.0;
	double w = Double.parseDouble(weight);
	
	double bmiResult = w / (h * h);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과화면</h2>
	<hr>
	<p> - 키 : <%= height %>cm </p>
	<p> - 체중 : <%= weight %>kg </p>
	<p> BMI 지수는 <%= bmiResult %>이므로 </p>
	<%-- 
	<% 
	out.println("- 키 : " + height + "cm<br/>");
	out.println("- 체중 : " + weight + "kg<br/><br/>");
	out.println("BMI 지수는  " + bmiResult + "이므로<br/>");
	--%>
	
	<% 	
	if(bmiResult > 23)
		out.println("당신은 과체중입니다.");
	else if(bmiResult < 18.5)
		out.println("당신은 저체중입니다.");
	else
		out.println("당신은 정상체중입니다.");
	%>
</body>
</html>