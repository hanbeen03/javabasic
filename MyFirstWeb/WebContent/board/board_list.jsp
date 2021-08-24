<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	<table class="table table-hover table-striped table-bordered"> <!--border="1"-->
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
	
	<c:if test="${pageDTO.hasBoard() }">
		<%-- 표현할 글이 있다면 부트스트랩 페이징처리 적용. --%>
		<ul class="pagination justify-content-center">
		
			<c:if test="${pageDTO.startPage > 10 }">
				<li class="page-item"><a class="page-link" href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage - 10}">«</a></li>
			</c:if>
			
			<c:forEach var="pNo" begin="${pageDTO.startPage}" end="${pageDTO.endPage}" >
				<li class="page-item"><a class="page-link" href="/MyFirstWeb/boardselect.do?page=${pNo }">${pNo}</a></li>
			</c:forEach>
			
			<c:if test="${pageDTO.endPage < pageDTO.totalPages }">
				<li class="page-item"><a class="page-link" href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage + 10}">»</a></li>
				
			</c:if>
		
		</ul>
	</c:if>
	
	<br/>
	<a href="/MyFirstWeb/board/board_write_form.jsp?writer=${writer}">글쓰기</a>&nbsp;
	<a href="/MyFirstWeb/logout.do">로그아웃</a>
</body>
</html>