<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 태그의 action은 데이터가 전달될 목적지입니다..
	현재, req_param_getpost로 날릴 예정입니다. -->
	<!-- 가장 기본이 되는 input태그 -->
	<form action="req_param_getpost.jsp" method="post">
		<input type="text" name="id"/>아이디<br>
		<input type="password" name="pw"/>비밀번호<br>
		<input type="text" name="intro" />자기소개<br>
		
		
		<!-- 체크박스 -->
		취미 :
		<input type="checkbox" name="hobby" value="요리">요리&nbsp;
		<input type="checkbox" name="hobby" value="운동">운동&nbsp;
		<br>
		특기 :
		<input type="checkbox" name="activity" value="발차기"/>발차기&nbsp;
		<input type="checkbox" name="activity" value="날아오르기"/>날아오르기&nbsp;
		<input type="checkbox" name="activity" value="콩까기"/>콩까기&nbsp;
		<input type="checkbox" name="activity" value="정권찌르기"/>정권찌르기&nbsp;
		<input type="checkbox" name="activity" value="개해엄치기"/>개해엄치기
		<br>
		<!-- 성별은 하나만 골라야 하므로 radio를 사용합니다. -->
		성별 : 
		<input type="radio" name="gender" value="남자" />남자&nbsp;
		<input type="radio" name="gender" value="여자" />여자&nbsp;
		<br/>
		
		학년 : 
		<input type="radio" name="grade" value="1학년" />1학년&nbsp;
		<input type="radio" name="grade" value="2학년" />2학년&nbsp;
		<input type="radio" name="grade" value="3학년" />3학년&nbsp;
		<input type="radio" name="grade" value="4학년" />4학년&nbsp;
		<br/>
		
		<!-- select태그는 선택지를 드롭박스로 줍니다. -->
		지역 : 
		<select name="region">
			<option>서울</option>
			<option>경기</option>
			<option>충청</option>
			<option>전라</option>
			<option>경상</option>
			<option>강원</option>
			<option>제주</option>
		</select>
		<br/>
		
		<input type="submit" value="제출"/>
		<input type="reset" value="리셋"/>
		

	</form>
</body>
</html>