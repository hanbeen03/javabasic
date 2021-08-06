<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%! String id = "";
	String pw = "";
--%>    
<%
	Cookie[] cookie = request.getCookies();
	//만약 아이디/비밀번호 기억하기가 체크되어 있는 경우
	//처리해주기 위해 쿠키에서 아이디/비밀번호 값을 추출하는 로직
	
	
	if( cookie != null ) {
		for(Cookie c : cookie) {
			if(c.getName().equals("user_id")) {
				response.sendRedirect("cookie_welcome.jsp");
			}
		}
	}
	
	String id = "";
	String pw = "";
	
	for(Cookie c : cookie) {
		
		if(c.getName().equals("remember_id")) {
			id = c.getValue();
			//System.out.println(id);
		}
		
		if(c.getName().equals("remember_pw")) {
			pw = c.getValue();
			//System.out.println(pw);
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 로그인 폼에는 checkbox를 이용해 자동로그인 여부까지 체크합니다. -->
	<form action="cookie_login_ok.jsp" method="get">
		<input type="text" name="id" placeholder="ID" 
			value="<%= id %>"/>
		<input type="checkbox" name="id_check" value="yes" />
		아이디 기억하기<br/>
		<input type="password" name="pw" placeholder="PW" 
			value="<%= pw %>"/>
		<input type="checkbox" name="pw_check" value="yes" />
		비밀번호 기억하기<br/>
		<input type="submit" value="로그인" />
	</form>

</body>
</html>