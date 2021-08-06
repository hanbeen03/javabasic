<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//서버에서 발급한 전체 쿠키목록을 가져오는 코드를 완성시켜주세요
	Cookie[] cookies = request.getCookies();
	String userId = null;

	for(Cookie c : cookies) {
		String s = c.getName();
		
		if(s.equals("user_id")) {
			userId = c.getValue();
			break;
		}
	}
	if(userId != null) {
		out.println(userId + "님 환영합니다.");
	} else {
		out.println("시간이 지나 자동 로그아웃 되었습니다.");
		out.println("<a href=\"cookie_login.jsp\">다시 로그인</a>");
	}
%>