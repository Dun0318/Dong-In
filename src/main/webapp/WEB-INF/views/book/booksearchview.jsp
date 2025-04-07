<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

td{text-align: center; color: gray;}
th{text-align: center; color: black;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>검색하신 정보입니다.</h2>
  <table class="table">
  <c:forEach items="${list}" var="result">
    <tbody>
      <tr class="active" >
     		<th>도서번호</th>
       		<td>${result.booknumber}</td>
       	</tr>
        <tr class="active">
     		<th>도서명</th>
     		<td>${result.bookname}</td>
        	
        </tr>
        <tr class="active">
     		<th>저자명</th>
     		<td>${result.writer}</td>
        </tr>
       	<tr class="active">
     		<th>도서 내용</th>
     		<td>${result.memo}</td>
        </tr>
        <tr class="active">
     		<th>도서 가격</th>
     		<td><fmt:formatNumber value="${result.price}" pattern="#,##0"></fmt:formatNumber>원</td>
        </tr>
        <tr class="active">
            <th>도서 이미지</th>
       	    <td><img src="./image/${result.image}" width="140px" height="140px"></td>
        </tr>
        </c:forEach>
    </tbody> 
  </table>
</div>
<center>
<img src="./image/flog12.gif" width="300px" height="300px">
</center>
</body>
</html>