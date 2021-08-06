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
	public int req = 0;
	public int random =0;
	
	public int getDan() {
		return (int)((Math.random() * 8) + 2);
	}
%>
<%
	req++;
	out.println("페이지 누적 요청 수 : " + req + "<br>");
	out.println("매 <b>10</b>번째 방문자에게는 기프티콘을 드립니다.<br>");
	if(req % 10 == 0) {
		out.println("당첨되셨습니다!!");
	}
%>
<hr>
<%
	int dan = getDan();
	out.println("<h2>랜덤 구구단(" + dan + "단)</h2>");
	out.println("이번에 나온 구구단은 " + dan + "단입니다.<br><br>");
	for(int i=1; i<=9; i++) {
		out.println(dan + " X " + i + " = " + (dan*i) + "<br>");
	}
%>
</body>
</html>