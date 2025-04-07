<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

td{text-align: center; color: gray;}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>자세한 정보</h2>
  <form action="reply" method="post">
  <table class="table">
    <tbody>
      <tr class="success" >
     	<th >도서번호</th>
       		<td>${dto.booknumber}</td>
       		</tr>
        <tr class="success">
     		<th>도서명</th>
        	<td>${dto.bookname}</td>
        </tr>
       	<tr class="success">
     		<th>도서내용</th>
       	 	<td>${dto.memo}</td>
        </tr>
        <tr class="success">
            <th>도서이미지</th>
       	    <td><img src="./image/${dto.image}" width="140px" height="140px"></td>
        </tr>
    </tbody> 
  </table>
  </form>
</div>
<center>
<img src="./image/do.gif" width="300px" height="300px">
</center>
</body>
</html>