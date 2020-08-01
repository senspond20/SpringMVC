<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#loginArea{min-width: 200px;}
	.inputLogin{width:100px;}
</style>
</head>
<body>
	
	<div id="loginArea">
      <c:if test="${ empty sessionScope.loginUser }">
         <form action="login.me" method="post">
            <table id="loginTable" style="text-align:center;">
               <tr>
                  <td>ID</td>
                  <td><input class="inputLogin" type="text" name="id"></td>
                  <td rowspan="2">
                     <button id="loginBtn">로그인</button>
                  </td>
               </tr>
               <tr>
                  <td>PW</td>
                  <td><input class="inputLogin" type="password" name="pwd"></td>
               </tr>
               <tr>
                  <td colspan="3">
                     <button type="button" onclick="location.href='enrollView.me'">회원가입</button>
                     <button type="button">아이디/비밀번호 찾기</button>
                  </td>
               </tr>
            </table>
         </form>
      </c:if>
      <c:if test="${ !empty sessionScope.loginUser }">
         <h3 align="right">
            <c:out value="${ loginUser.name }님 환영합니다."/> <!-- c:out 활용 -->
            <c:url var="myinfo" value="myinfo.me"/>
            <c:url var="logout" value="logout.me"/>
            <button onclick="location.href='${myinfo}'">정보보기</button>
            <button onclick="location.href='${logout}'">로그아웃</button>
         </h3>
      </c:if>
   </div>
   
</body>
</html>