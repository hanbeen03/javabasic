<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정창</h1>
	<form action="boardupdateok.do" method="post">
	
		<input type="hidden" name="bid" value="${boardDetail.bId }" />
		<input type="hidden" name="bhit" value="${boardDetail.bHit }" />
		<input type="hidden" name="bdate" value="${boardDetail.bDate }" />
		<input type="hidden" name="bname" value="${boardDetail.bName }" />
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
				<td colspan="3"><input type="text" name="title" value="${boardDetail.bTitle}"/></td>
			</tr>
			<tr>
				<td align="center"><b>본문</b></td>
				<td colspan="3"><textarea rows="20" cols="40" name="content">${boardDetail.bContent}</textarea></td>
			</tr>
			<tr>
				<td align="center"><b>글쓴이</b></td>
				<td colspan="3">${boardDetail.bName }</td>
			</tr>
		</table>
		
		<input type="submit" value="수정하기" />
		<input type="reset" value="초기화하기" />
		<a href="/MyFirstWeb/boardselect.do"><input type="button" value="리스트로 돌아가기"/></a>
	
		
	</form>
</body>
</html>