<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form role="form" action="/board/modify" method="post">
		<input type="hidden" name="bno" value="${board.bno }">
		<div class="form-group">
			<label>Title</label><input class="form-control" name='title' value="${board.title }">
		</div>
		
		<div class="form-group">
			<label>content</label><input class="form-control" name='content' value="${board.content }">
		</div>
		
		<div class="form-group">
			<label>Writer</label><input class="form-control" name='writer' value="${board.writer }">
		</div>
		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="submit" class="btn btn-default">Reset Button</button>
	</form>
</body>
</html>