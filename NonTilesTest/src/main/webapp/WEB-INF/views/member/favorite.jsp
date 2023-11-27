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
<%-- member > history.jsp --%>
<%@ include file="/WEB-INF/inc/main_menu.jsp" %>

<%@ include file="/WEB-INF/inc/member_menu.jsp" %>

<main>
	<h1>회원 <small>즐겨찾기</small></h1>
	<div>
		<div><a href="#">구글</a></div>
		<div><a href="#">아마존</a></div>
		<div><a href="#">깃헙</a></div>
	</div>
</main>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>

</script>
</body>
</html>