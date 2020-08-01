<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="stylesheet" href="${contextPath}/resources/css/member-style.css" type="text/css"> --%>
<style>
	.wrapper{ display:flex;	}
	.wrapper .content{
		width: 980px; min-height: 900px;
		border-right: 1px solid rgba(0,0,0,0.075);
		text-align: center;
	}
</style>
</head>
<body>
	<header>
	 	<jsp:include page="WEB-INF/views/common/menubar.jsp"/>   
	</header>
	
	<section class ="wrapper">
	    <div>
	     <c:import url ="WEB-INF/views/common/loginArea.jsp" />
	    </div>
	   
	    <div class = "content">
			<h1>Index</h1>
			<p>안녕하세요.</p>
	    </div>
	
	</section>
	<footer></footer>
</body>
</html>