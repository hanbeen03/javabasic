<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Integer> lottoNum = new ArrayList<>();
		int random;
		while(lottoNum.size() != 6) {
			random = (int)(Math.random() * 45 + 1);
			
			if(lottoNum.contains(random))
				continue;
			else
				lottoNum.add(random);
		}
		
		Collections.sort(lottoNum);
		
		out.println("<h1>로또 번호 생성 결과</h1>");
		out.println("이번주 로또는 이 번호다!!<br>");
	
		for(Integer num : lottoNum) {
			out.println(num + "&nbsp;");
			Thread.sleep(700);
			out.flush();
		}
		//out.println(lottoNum.toString());
		//lottoNum.clear();
	%>
	
	<%-- 
	<% for(int i=0; i<6; i++) {
		<%= lottoNum.get(i) %>   
	<% } %> 
	--%>
</body>
</html>