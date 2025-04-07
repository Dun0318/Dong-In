<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th{text-align: center;}
td{text-align: center; color: gray;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>도서 출력</h2>
  <table class="table">
    <thead>
      <tr>
        <th>도서번호</th><th>도서명</th><th>저자명</th><th>도서가격</th><th>도서이미지</th><th>조회수</th><th colspan="2" align="center">비고</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.booknumber}</td>
        <td><a href="bookcountup?booknumber=${result.booknumber}">
        ${result.bookname}</a></td>
        <td>${result.writer}</td>
        <td><fmt:formatNumber value="${result.price}" pattern="#,##0"></fmt:formatNumber>원</td>
        <td><img src="./image/${result.image}" width="70px" height="70px"></td>
        <td>${result.count}</td>
        <td><a href="bookupdate?booknumber=${result.booknumber}">수정</a></td>
        <td><a href="bookdelete?booknumber=${result.booknumber}">삭제</a></td>
      </tr>
     </c:forEach>
    </tbody>
    
  </table>
</div>
<center>
<img src="./image/ohm15.gif" width="300px" height="300px">
</center>
</body>
</html>