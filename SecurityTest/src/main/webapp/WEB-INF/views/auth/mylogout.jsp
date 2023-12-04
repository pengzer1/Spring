<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>

</style>
</head>
<body>
<%-- mylogout.jsp --%>
<%@ include file="/WEB-INF/views/inc/header.jsp" %>

<h2>Logout Page</h2>

<!-- 
	*** 주의
	1. method="POST"
	2. action="/컨텍스트명/로그아웃페이지"
	3. 아이디: name="username"
	4. 암호: name="password"
 -->
<form method="post" action="/spring/auth/mylogout.do">
	<div>
		<button class="out">로그아웃</button>
	</div>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
</form>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>

</script>
</body>
</html>