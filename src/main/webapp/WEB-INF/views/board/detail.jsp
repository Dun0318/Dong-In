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
  <h2>글보기</h2>
  <form action="reply" method="post">
  <input type="hidden" value="${dto.boardnumber}" name = "boardnumber">
  <table class="table">

    <tbody>
      <tr class="active" >
     		<th>제목</th>
       		<td>${dto.title}</td>
       	</tr>
       	<tr class="active" >
     		<th>작성자</th>
       		<td>${dto.writer}</td>
       	</tr>
        <tr class="active">
     		<th>글내용</th>
     		<td>${dto.text}</td>
        </tr>
      <tr>
      	<td colspan="2" align="center">
      	<input type="submit" value="댓글달기">
      	<input type="button" value="취소" onclick="location.href='main'">
      	</td>
      </tr>
     
    </tbody> 
  </table></form>
</div>
</body>
</html>