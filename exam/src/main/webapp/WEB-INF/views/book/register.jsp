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
	<form role="form" action="register" method="post">
		<div class="form-group">
			<label>도서번호</label><input class="form-control" name='book_no'>	
		</div>
		
		<div class="form-group">
			<label>도서명</label><input class="form-control" name='book_name'>
		</div>
		
		<div class="form-group">
			<label>출판일자</label><input class="form-control" name='book_date'>
		</div>
		
		<div class="form-group">
			<label>금액</label><input class="form-control" name='book_price'>
		</div>
		
		<div class="form-group">
			<label>출판사</label><input class="form-control" name='book_publisher'>
		</div>
		
		<div class="form-group">
			<label>도서소개</label><input class="form-control" name='book_info'>
		</div>
		
		<button type="submit" class="btn btn-default">등록</button>
		<button type="submit" class="btn btn-default">조회</button>
	</form>
<%@include file="/WEB-INF/views/includes/footer.jsp" %>
</html>