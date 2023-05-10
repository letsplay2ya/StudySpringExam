<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<div class="content">
	<h1>main</h1>
	<c:forEach var="sample" items="${sampleList}">
		<p>${sample.name } / ${sample.age}</p>
	</c:forEach>
	<hr>
</div>
</body>
</html>
