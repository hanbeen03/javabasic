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
	<div class="container">
		<div class="row">
			<h1 class="text-info">글쓰기 창</h1>
		</div>
	<form action="/MyFirstWeb/boardwrite.do" method="post">
		<div class="row">
			<div class="col-md-2">
				<b>글 제목</b>
			</div>
			<div class="col-md-5">
				<input type="text" name="title" placeholder="제목을 입력해주세요" class="form-control" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">	
				<b>본문</b>
			</div>
			<div class="col-md-5">
				<textarea name="content" cols="40" rows="20" placeholder="내용을 입력하세요" class="form-control"></textarea>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<b>글쓴이</b>
			</div>
			<div class="col-md-5">
				<input type="text" name="writer" value="${param.writer }" placeholder="작성자 이름을 입력하세요" readonly class="form-control" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<div class="btn-group">
					<input type="submit" value="글쓰기" class="btn btn-info" />
					<input type="reset" value="초기화" class="btn btn-dark" />
				</div>
			</div>
		</div>
	</form>
	</div>
</body>
</html>