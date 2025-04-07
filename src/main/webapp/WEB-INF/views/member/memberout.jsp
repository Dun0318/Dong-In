<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th{
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>회원 정보 출력</h2>
  <table class="table" >
    <thead>
      <tr>
        <th>ID</th>
        <th>Password</th>
        <th>Name</th>
        <th>Age</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${list}" var="result">
      <tr class="danger">
        <td>${result.id}</td>
        <td>${result.password}</td>
        <td>${result.name}</td>
        <td>${result.age}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
<center>
<img src="./image/fire.gif" width="300px" height="300px">
</center>
</body>
</html>
