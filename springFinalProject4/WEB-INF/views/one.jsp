<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/css/project.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function(){
		//ajax통신
		$("input").click(function(){					
			$.ajax({
				rul: "basket",
				data: {
					id : ${dto.id},
					title: "${dto.title}",
					price: ${dto.price}
				},
				succes: function(result){
					alert("ok!" + result)
				}
			})
	})
})
</script>
</head>
<body>
	<div id="total">
		<div id="top"></div>
		<jsp:include page="/top.jsp"></jsp:include>
		<div id="top2"></div>
		<jsp:include page="/top2.jsp"></jsp:include>
		<div id="center">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td>상품명</td>
					<td>가격</td>
					<td>그림</td>
				</tr>

					<tr>
						<td id ="tId">${dto.id}</td>
						<td>${dto.title}</td>
						<td>${dto.content}</td>
						<td>${dto.price}</td>
						<td><img src=resources/img/${dto.img} width=100 height="100">
						</td>
					</tr>
			</table>
			<center>
			<br>
				<input 	type="image" 
						src="resources/img/bag.png" 
						width="100" 
						height="100">
			</center>
		</div>
	</div>


</body>
</html>