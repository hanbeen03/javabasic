<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="req_bmi_result.jsp" method="post" >
		키(height) : 
		<input type="text" name="height" />cm<br/>
		체중(weight) : 
		<input type="text" name="weight" />kg<br/>
		<input type="submit" value="확인" />
		<input type="reset" value="초기화" />
		
	
	</form>

</body>
</html>