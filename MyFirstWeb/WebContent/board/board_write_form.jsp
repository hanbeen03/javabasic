<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기 창</h1>
	<form action="/MyFirstWeb/boardwrite.do" method="post">
		<table border="1">
			<tr>
				<td align="center"><b>글 제목</b></td>
				<td><input type="text" name="title" placeholder="제목을 입력해주세요" /></td>
			</tr>
			<tr>
				<td align="center"><b>본문</b></td>
				<td><textarea name="content" cols="40" rows="20" placeholder="내용을 입력하세요"></textarea></td>
			</tr>
			<tr>
				<td align="center"><b>글쓴이</b></td>
				<td><input type="text" name="writer" value="${param.writer }" placeholder="작성자 이름을 입력하세요" readonly/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="글쓰기"/>
					<input type="reset" value="초기화"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>