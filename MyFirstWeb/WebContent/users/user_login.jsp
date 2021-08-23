<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1 { 
		padding-left:50px;
		padding-top:50px;
		padding-bottom:50px;
		color:black;
		
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 class="text-primary">로그인 창</h1>
		</div>
		<form action="/MyFirstWeb/login.do" method="post">
			<div class="row">
				<div class="col-md-2">아이디 </div>
				<div class="col-md-5">
					<input type="text" name="id" placeholder="아이디" class="form-control" /><br>
				</div>	
			</div>
			<div class="row">
				<div class="col-md-2">비밀번호 </div>
				<div class="col-md-5">
					<input type="password" name="pw" placeholder="비밀번호 " class="form-control" /><br/>
				</div>	
			</div>
			<div class="row">
				<div class="col-md-2 offset-md-3">
					<input type="submit" value="로그인" class="btn btn-primary" />&nbsp;
				</div>
			</div>
			<a href="users/users_join_form.jsp">회원가입</a>
		</form>
	</div>
</body>
</html>