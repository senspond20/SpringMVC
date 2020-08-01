<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
	border-bottom: 1px solid #333;
	padding-bottom: 10px;
}
</style>
</head>
<body>
	<header>
		<div id ="menubar">
			<a href ="<%= request.getContextPath() %>/home.do" > HOME</a>
		</div>
	</header>
	<section>
		<h1>Index</h1>
		<p>안녕하세요.</p>
	</section>
	
</body>
</html>