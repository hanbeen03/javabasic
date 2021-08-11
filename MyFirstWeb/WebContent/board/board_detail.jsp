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
	<h1>글 상세 페이지</h1>
	<!-- ${boardDetail} -->
	<table border="1">
		<tr>
			<td align="center"><b>글 번호</b></td>
			<td>${boardDetail.bId }</td>
			<td align="center"><b>조회수</b></td>
			<td>${boardDetail.bHit }</td>
		</tr>
		<tr>
			<td align="center"><b>쓴 날짜</b></td>
			<td colspan="3">${boardDetail.bDate }</td>
		</tr>
		<tr>
			<td align="center"><b>글 제목</b></td>
			<td colspan="3">${boardDetail.bTitle }</td>
		</tr>
		<tr>
			<td align="center"><b>본문</b></td>
			<td colspan="3"><textarea rows="20" cols="40" name="content" readonly>${boardDetail.bContent }</textarea></td>
		</tr>
		<tr>
			<td align="center"><b>글쓴이</b></td>
			<td colspan="3">${boardDetail.bName }</td>
		</tr>
	</table>
	<a href="/MyFirstWeb/boardselect.do"><input type="button" value="리스트로 돌아가기"/></a>
	
	<form action="boarddelete.do" method="post">
		<input type="hidden" value="${boardDetail.bId }" name="bId"/>
		<input type="submit" value="삭제" />
	</form>
	
	<form action="boardupdate.do" method="post">
		<input type="hidden" value="${boardDetail.bId}" name="bId"  />
		<input type="submit" value="수정"/>
	</form>
	
</body>
</html>