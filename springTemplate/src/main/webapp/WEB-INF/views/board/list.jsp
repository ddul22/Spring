<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H3>게시글목록</H3>
<a href="register">등록</a>
	<tbody>
		<table class="table table-spriped table-bordered table-hober">
			<thead>
				<tr>
					<th>#번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>수정일</th>
				</tr>
			</thead>
			
			<c:forEach items="${list }" var="board">
			
			<tr>
				<td>${board.bno }</td>
				<td><a href='get?bno=${board.bno }'>${board.title }</a></td>
					<td>${board.title }</td>
					<td><c:out value="${board.writer }"/></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regDate }"/></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updateDate }"/></td>
			</tr>
			</c:forEach>
		</table>
	</tbody>
</body>
</html>