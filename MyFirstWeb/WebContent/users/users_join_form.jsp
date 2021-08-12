<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users.join.jsp
	로 보내주는 form을 작성해주세요. 
	보내는 input 태그의 name 속성은 컬럼명과 일치시켜주세요.-->
	<h1>회원가입 창입니다.</h1>
	<form action="/MyFirstWeb/join.do" method="post">
		<input type="text" name="id" placeholder="아이디"/><br/>
		<input type="password" name="pw" placeholder="비밀번호"/><br/>
		<input type="text" name="uname" placeholder="성명"/><br/>
		<input type="email" name="email" placeholder="이메일주소"/><br/><br/>
		<input type="submit" value="회원가입"/>&nbsp;
		<input type="reset" value="초기화"/>
	</form>
</body>
</html>