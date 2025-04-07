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
  <h2>공지사항입니다.</h2>
  <table class="table">
    <tbody>
      <tr class="active" >
     		<th>제목</th>
       		<td>${dto.num}</td>
       	</tr>
        <tr class="active">
     		<th>글내용</th>
     		<td>${dto.text}</td>
		</tr>
    </tbody> 
  </table>
</div>

</body>
</html>