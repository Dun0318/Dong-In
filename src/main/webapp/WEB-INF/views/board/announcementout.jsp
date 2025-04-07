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
  <h2>공지게시판</h2>
  
  <table class="table">
    <thead>
      <tr>
        <th>글번호</th><th>제목</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="result">
      <tr class="warning">
        <td>${result.num}</td>
        <td><a href ="announcementtext?num=${result.num}">${result.title}</a></td>
      </tr>
     </c:forEach>
    </tbody>
    
  </table>
</div>
</body>
</html>