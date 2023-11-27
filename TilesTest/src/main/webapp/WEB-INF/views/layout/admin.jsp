<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>타일즈</title>
<tiles:insertAttribute name="asset" />
<style>

</style>
</head>
<body>
<%-- layout > info.jsp --%>
<tiles:insertAttribute name="main_menu" />

<tiles:insertAttribute name="admin_menu" />

<tiles:insertAttribute name="content" />

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>

</script>
</body>
</html>