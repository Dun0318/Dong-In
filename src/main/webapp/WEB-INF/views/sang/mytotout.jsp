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
  <h2>개인 정보 활용 구입 내역</h2>
  <table class="table">
    <thead>
      <tr>
        <th>카드번호</th><th>이름</th><th>전화번호</th>
        <th>상품명</th><th>가격</th><th>구입날짜</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.cardnumber}</td>
        <td>${result.name}</td>
        <td>${result.phone}</td>
        <td>${result.sdto.sname}</td> <!-- 가져온 값은 MyinfoDTO 이다 즉 그 안에 연결되 있는 sdto를 적어줘야 SangDTO안에 있는 자료를 불러와 출력할 수 있다 -->
        <td><fmt:formatNumber value="${result.sdto.price}" pattern="#,##0"></fmt:formatNumber>원</td>
        <td><fmt:formatDate value="${result.sdto.day}" pattern="yyyy-MM-dd"/></td>
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