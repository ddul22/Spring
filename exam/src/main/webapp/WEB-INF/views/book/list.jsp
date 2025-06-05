<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="/WEB-INF/views/includes/header.jsp" %>

<H3>도서대여관리</H3>
<a href="register">도서등록</a>
<a href="">도서목록조회/수정</a>
<a href="">대여현황조회</a>
<a href="">홈으로</a>
	<tbody>
		<table class="table table-spriped table-bordered table-hober">
			<thead>
				<tr>
					<th>도서번호</th>
					<th>도서명</th>
					<th>출판일자</th>
					<th>금액</th>
					<th>출판사</th>
					<th>도서소개</th>
				</tr>
			</thead>
			
			<c:forEach items="${list }" var="book">
			
			<tr>
				<td>${book.book_no }</td>
				<td><a href='get?bno=${book.book_no }'>${book.book_name }</a></td>
					
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${book.book_date }"/></td>
					<td><c:out value="${book.book_price }"/></td>
					<td><c:out value="${book.book_publisher }"/></td>
					<td><c:out value="${book.book_info }"/></td>
					
			</tr>
			</c:forEach>
		</table>