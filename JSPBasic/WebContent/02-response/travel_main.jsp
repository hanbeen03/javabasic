<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행 안내 페이지</title>
</head>
<body>
	<form action="travel_check.jsp" method="get">
		여행지를 선택해주세요.<br/>
		<input type="radio" name="city" value="뉴욕" />뉴욕&nbsp;
		<input type="radio" name="city" value="파리" />파리&nbsp;
		<input type="radio" name="city" value="하와이" />하와이&nbsp;
		<input type="radio" name="city" value="제주도" />제주도<br>
		<input type="submit" value="확인" />
	</form>
</body>
</html>