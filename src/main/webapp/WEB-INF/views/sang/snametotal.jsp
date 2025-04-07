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
  <h2>상품명별 구매 합계</h2>
  <table class="table">
    <thead>
      <tr>
        <th>상품명</th><th>구입 총합계</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.sname}</td>
        <td><fmt:formatNumber value="${result.tot}" pattern="#,##0"></fmt:formatNumber>원</td>
      </tr>
     </c:forEach>
    </tbody>
    
  </table>
</div>
<center>
<img src="./image/flog2.gif" width="300px" height="300px">
</center>
</body>
</html>