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

	<h4>1부터 100까지의 합</h4>
	<c:set var="sum" value="0" />
	<c:forEach var="n" begin="1" end="100">
		<c:set var="sum" value="${sum + n}"/>
	</c:forEach>
	${sum}<br/>
	<c:out value="${sum}" /><br/>
	
	<h4>1부터 100까지의 홀수의 합</h4>
	<c:set var="sum" value="0" />
	<c:forEach var="n" begin="1" end="100" step="2">
		<c:set var="sum" value="${sum + n}"/>
	</c:forEach>
	${sum}<br/>
	<c:out value="${sum}" /><br/>
</body>
</html>