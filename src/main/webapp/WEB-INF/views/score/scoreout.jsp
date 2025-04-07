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
        <th>반</th><th>번호</th><th>이름</th><th>국어점수</th><th>영어점수</th><th>수학점수</th>
        <th>총점수</th><th>평균점수</th><th>학점</th><th>반석차</th><th>전체석차</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.ban}반</td>
        <td>${result.num}번</td>
        <td>${result.name}</td>
        <td>${result.kor}점</td>
        <td>${result.eng}점</td>
        <td>${result.mat}점</td>
        <td>${result.tot}점</td>
        <td>${result.aver}점</td>
        <td>${result.rank}</td>
        <td>${result.banrank}등</td>
        <td>${result.allrank}등</td>
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