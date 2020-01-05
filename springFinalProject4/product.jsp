<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="resources/css/project.css">
</head>
<body>
<div id="total">
	<div id="top"></div>
		<jsp:include page="top.jsp"></jsp:include>
	<div id="top2"></div>
		<jsp:include page="top2.jsp"></jsp:include>
	<div id="center">
		<jsp:forward page="product"></jsp:forward>
	</div>
	
	
</div>


</body>
</html>