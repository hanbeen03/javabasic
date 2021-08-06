<%@ page import="java.util.*" %>
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
		List<String> role = new ArrayList<>();
		
	%>
	<%
		if(role.size() == 10)
			role.clear();
	
		double random;
		String sRole = "";
		int rSame = 0;
		
		random = Math.random();
			
		if(random >= 0.80)
			sRole = "도적";
		else if(random >= 0.60)
			sRole = "마법사";
		else if(random >= 0.40)
			sRole = "사제";
		else if(random >= 0.20)
			sRole = "전사";
		else 
			sRole = "사냥꾼";
			
			role.add(sRole);
		
			
		for(String r : role) {
			if(sRole.equals(r))
				rSame++;
		}
		/*	
		for(int i=0; i < role.size(); i++) {
			if(role.get(i).equals(sRole)) {
				rSame++;
			}
		}
		*/
	%>
	<h1>당신의 역할</h1>
	<p>당신에게 부여된 역할은 <b>[<%= sRole %>]</b>입니다.</p><br>
	<p>현재 파티에 당신과 같은 역할을 가진 플레이어는 <%= rSame %>명 입니다.</p><br><br>
	<p>현재 파티 구성</p><br>
	<%
		out.println(role.toString() + "(" + role.size() + "명 참가중)");
	%>
	
</body>
</html>