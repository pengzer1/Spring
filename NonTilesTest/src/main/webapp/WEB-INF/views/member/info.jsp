<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example</title>
<%@ include file="/WEB-INF/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
<%-- member > info.jsp --%>
<%@ include file="/WEB-INF/inc/main_menu.jsp" %>

<%@ include file="/WEB-INF/inc/member_menu.jsp" %>

<main>
	<h1>회원 <small>회원 정보</small></h1>
	<div class="message" title="홍길동">
		일반 회원입니다.
	</div>
</main>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>

</script>
</body>
</html>