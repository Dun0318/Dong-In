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
  <h2>전체 게시판</h2>
  
  <table class="table">
    <thead>
      <tr>
        <th>글번호</th><th>제목</th><th>작성자</th><th>작성일자</th><th>조회수</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.boardnumber}</td>
        <td><c:forEach var="i" begin="0" end="${result.indent}">
		&emsp;<!-- 칸 띄우기 -->
		
		</c:forEach>
        <a href ="detail?boardnumber=${result.boardnumber}">${result.title}</a></td>
        <td>${result.writer}</td>
        <td>${result.day}</td>
        <td>${result.count}</td>
      </tr>
     </c:forEach>
    </tbody>
    
  </table>
</div>
</body>
</html>