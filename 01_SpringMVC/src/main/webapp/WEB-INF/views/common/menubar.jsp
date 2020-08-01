<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>

<style>
   #menubar{  display:flex;  }
   .menu { margin-right: 10px; padding-right:10px; border-right: 1px solid #333; }
   .menu:last-of-type { border-right: none;}
   .menu:hover { cursor:pointer;}
   .menu:hover a{ color:red; font-weight: bolder; }
   a:link {color: black; text-decoration: none;} 
   a:visited {color: black; text-decoration: none;} 
</style>
</head>
<body>
 
  <!--어느 페이지든 포함하고 있는  메뉴바는 여기서 contextPath 변수 공유 -->
   <c:set var="contextPath" value="${ pageContext.servletContext.contextPath }" scope="application"/>  
		<nav id ="menubar">
			<div class="menu"><a href ="<%= request.getContextPath() %>/home.do" > HOME</a></div>
			<div class="menu"><a href="${contextPath}/blist.bo">게시판</a></div>
			<div class="menu"><a href="about.me">about</a></div>
		</nav>
   <hr />
  
   

</body>
</html>