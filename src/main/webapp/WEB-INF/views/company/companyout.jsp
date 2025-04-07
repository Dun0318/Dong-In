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
  <h2>사원 자료 출력</h2>
  <table class="table">
    <thead>
      <tr>
        <th>사원번호</th><th>사원명</th><th>성별</th><th>나이</th><th>근무기간</th>
        <th>가족수당</th><th>직위수당</th><th>총급여</th><th>비고</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <td>${result.snumber}</td>
      <td>${result.name}</td>
      <td>${result.sexuality}</td>
      <td>${result.age}세</td>
      <td>${result.inday}년</td>
      <td><fmt:formatNumber value="${result.familysudang}" pattern="#,##0"></fmt:formatNumber>원</td>
      <td><fmt:formatNumber value="${result.ranksudang}" pattern="#,##0"></fmt:formatNumber>원</td>
      <td><fmt:formatNumber value="${result.totalSalary}" pattern="#,##0"></fmt:formatNumber>원</td>
      <td><a href="companyupdate?snumber=${result.snumber}">[ 수정 ]</a>
      <a href="companydelete?snumber=${result.snumber}">[ 삭제 ]</a></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
<center>
<img src="./image/flog8.gif" width="300px" height="300px">
</center>
</body>
</html>