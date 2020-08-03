<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${contextPath}/resources/css/member-style.css" type="text/css">
<style>
	span.guide{display: none; font-size: 12px; top: 12px; right: 10px;}
	span.ok{color: green;}
	span.error{color: red;}
</style>
</head>
<body>
   <jsp:include page="../common/menubar.jsp"/>
   
   <h1 align="center">회원가입</h1>
   
   <div class="centerText">
      <form action="minsert.me" method="post" id="joinForm">
         <table>
            <tr>
               <th>* 아이디</th>
               <td>
                  <input type="text" name="id" id="userId">
                  <span class ="guide ok">이 아이디는 사용 가능합니다.</span>
                  <span class ="guide error">이 아이디는 사용할 수 없습니다.</span>
                  <input type ="hidden" name ="idDuplicateCheck" id="idDuplicateCheck" value="0" />
                  
               </td>
            </tr>
            <tr>
               <th>* 이름</th>
               <td><input type="text" name="name"></td>
            </tr>
            <tr>
               <th>* 비밀번호</th>
               <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
               <th>* 비밀번호확인</th>
               <td><input type="password" name="pwd2"></td>
            </tr>
            <tr>
               <th>성별</th>
               <td>
                  <input type="radio" name="gender" value="M">남
                  <input type="radio" name="gender" value="F">여
               </td>
            </tr>
            <tr>
               <th>나이</th>
               <td><input type="number" min="20" max="100" name="age"></td>            
            </tr>
            <tr>
               <th>이메일</th>
               <td><input type="email" name="email"></td>
            </tr>
            <tr>
               <th>전화번호</th>
               <td><input type="tel" name="phone"></td>
            </tr>
            <tr>
               <th>우편번호</th>
               <td>
                  <input type="text" name="post" class="postcodify_postcode5" value="" size="6">
                  <button type="button" id="postcodify_search_button">검색</button>
               </td>
            </tr>
            <tr>
               <th>도로명 주소</th>
               <td><input type="text" name="address1" class="postcodify_address" value=""></td>
            </tr>
            <tr>
               <th>상세 주소</th>
               <td><input type="text" name="address2" class="postcodify_extra_info" value=""></td>
            </tr>
            
            <!-- jQuery와 Postcodify를 로딩한다. -->
            <!-- 주소API를 안쓰고도 주소를 참고할수 있는 스크립트 -->
            <script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
            <script>
               // 검색 단추를 누르면 팝업 레이어가 열리도록 설정한다.
               $(function(){
                  $("#postcodify_search_button").postcodifyPopUp();
               });
            </script>
            
            <tr>
               <td colspan="2" align="center">
                  <button onclick="validate();">가입하기</button>
                  <input type="reset" value="취소하기">
                  <button type="button" onclick="location.href='home.do'">시작 페이지로 이동</button>
               </td>
            </tr>
         </table>
      </form>
   </div>
   
   <script>
   		$('#userId').on('keyup', function(){
   			var userId = $(this).val().trim();
   			if(userId.length < 4){
   				$('.guide').hide();
   				$('#idDuplicateCheck').val(0);	
   				return;
   			}
   			
   			$.ajax({
   				url : 'dupid.me',
   				data : {id:userId},
   				success: function(data){
   					
   					// id를 쓸 수 있으면 error는 숨기고 ok는 보여주면서 idDuplicateCheck의 값을 1으로 변경
   					// id를 쓸 수 없으면 error는 보이고 ok는 숨기면서 idDuplicateCheck의 값을 0으로 변경
   					console.log(data);
   					if(data == 'true'){
   						$('.guide.error').hide();
   						$('.guide.ok').show();
   						$('#idDuplicateCheck').val(1);
   						
   					}else{
   						$('.guide.error').show();
   						$('.guide.ok').hide();
   						$('#idDuplicateCheck').val(0);
   					}
   				}
   			});
   			
   		});
   	
   		
   		function validate(){
   			if($('#idDuplicateCheck').val() == 0){
   				alert('사용가능한 아이디를 입력하세요.');
   				$('#userId').focus();
   				return false;
   			}else{
   				$('#joinForm').submit();
   			}
   		}
   
   </script>
   
</body>
</html>