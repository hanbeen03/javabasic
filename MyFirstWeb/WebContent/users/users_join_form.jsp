<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users.join.jsp
	로 보내주는 form을 작성해주세요. 
	보내는 input 태그의 name 속성은 컬럼명과 일치시켜주세요.-->
	<div class="container">
		<h1 class="text-warning">회원가입 창입니다.</h1>
		<form action="/MyFirstWeb/join.do" method="post">
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text">아이디&nbsp;&nbsp;&nbsp;</span>
			</div>
			<input type="text" name="id" placeholder="아이디" class="form-control"/>
		</div>
		
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text">비밀번호</span>
			</div>
			<input type="password" name="pw" placeholder="비밀번호" class="form-control"/>
		</div>
		
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text">성명&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			</div>
			<input type="text" name="uname" placeholder="성명" class="form-control"/>
		</div>
			
		<div class="input-group">
			<div class="input-group-prepend">
				<span class="input-group-text">이메일&nbsp;&nbsp;&nbsp;</span>
			</div>
			<input type="email" name="email" placeholder="이메일주소" class="form-control"/>
			<div class="input-group-append">
				<span class="input-group-text">ex)example@example.com</span>
			</div>
		</div>
		<br>
			
		<div class="btn-group" align="center">
			<input type="submit" value="회원가입" class="btn btn-info" />
			<input type="reset" value="초기화" class="btn btn-danger"/>
		</div>	
	</form>
	</div>
</body>
</html>