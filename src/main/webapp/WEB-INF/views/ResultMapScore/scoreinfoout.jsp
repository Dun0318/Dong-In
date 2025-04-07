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
  <h2>성적 출력</h2>
  <table class="table">
    <thead>
      <tr>
        <th>학번</th><th>이름</th><th>전화번호</th>
        <th>국어점수</th><th>영어점수</th><th>수학점수</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.num}번</td>
        <td>${result.name}</td>
        <td>${result.phone}</td>
        <td>${result.sdto.kor}점</td>
        <td>${result.sdto.eng}점</td>
        <td>${result.sdto.mat}점</td>
      </tr>
     </c:forEach>
    </tbody>
    
  </table>
</div>
<center>
<img src="./image/flog5.gif" width="300px" height="300px">
</center>
</body>
</html>