<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <!-- 위처럼 c:url을 통해서 지정할 수도 있지만 지금까지 해왔던 것처럼 바로 href에 url을 넣어도 상관없음 -->
	<div id ="error-container" style="text-align: center;">
		<h1>Error</h1>
		<h2 style="color: red;">${ message }</h2>
		<h2 style="color: red;">${ requestScope['javax.servlet.error.message'] }</h2>
	</div>
</body>
</html>