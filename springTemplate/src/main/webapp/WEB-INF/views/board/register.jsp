<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="/WEB-INF/views/includes/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form role="form" action="/board/register" method="post">
		<div class="form-group">
			<label>Title</label><input class="form-control" name='title'>	
		</div>
		
		
		<div class="form-group">
			<label>Text area</label><input class="form-control" name='content'>
		</div>
		
		<div class="form-group">
			<label>Writer</label><input class="form-control" name='writer'>
		</div>
		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="submit" class="btn btn-default">Reset Button</button>
	</form>
<%@include file="/WEB-INF/views/includes/footer.jsp" %>
</html>