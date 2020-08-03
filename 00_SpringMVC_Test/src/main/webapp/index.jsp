<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	
	<div id ="data"></div>
	<script>

	
		$(document).ready(function(){
		 
			$.ajax({
				url : 'gg',
				dataType : 'json',
			success : function(data) {
				console.log(data);
			}
		});
	});
	
	</script>
</body>
</html>