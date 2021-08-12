<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>작성날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${boardList }" var="board">
				<tr>
					<td>${board.bId}</td>
					<td><a href="/MyFirstWeb/boarddetail.do?bId=${board.bId }">${board.bTitle}</a></td>
					<td>${board.bName}</td>
					<td>${board.bDate}</td>
					<td>${board.bHit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/MyFirstWeb/board/board_write_form.jsp?writer=${writer}">글쓰기</a>&nbsp;
	<a href="/MyFirstWeb/logout.do">로그아웃</a>
</body>
</html>