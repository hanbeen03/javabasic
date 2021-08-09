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

<c:if test="${param.name == '홍길동'}">
	<p>name 파라미터의 값이 ${param.name}입니다.</p>
</c:if>
<c:if test="${param.name == '이순신'}">
	<p>name 파라미터의 값이 ${param.name}입니다.2</p>
</c:if>

</body>
</html>