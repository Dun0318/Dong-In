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
  <h2>개인 정보 출력</h2>
  <table class="table">
    <thead>
      <tr>
        <th>카드번호</th><th>이름</th><th>전화번호</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.cardnumber}</td>
        <td>${result.name}</td>
        <td>${result.phone}</td>
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