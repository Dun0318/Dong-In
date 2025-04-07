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
  <h2>수정 정보</h2>
  <p>수정이 필요한 부분을 입력해주세요! [ 도서번호는 수정이 불가능 합니다 ])</p>
  <form action="bookupdatego" method="post" enctype="multipart/form-data">
  <table class="table">
    <tbody>
      <tr class="info" >
     		<th>도서번호</th>
       		<td><input type="text" value="${dto.booknumber}" name="booknumber" readonly="readonly"></td>
       	</tr>
        <tr class="info">
     		<th>도서명</th>
     		<td><input type="text" value="${dto.bookname}" name="bookname" required="required"></td>
        	<td></td>
        </tr>
        <tr class="info">
     		<th>저자명</th>
     		<td><input type="text" value="${dto.writer}" name="writer" required="required"></td>
        </tr>
       	<tr class="info">
     		<th>도서 내용</th>
     		<td><input type="text" value="${dto.memo}" name="memo" required="required"></td>
        </tr>
        <tr class="info">
     		<th>도서 가격</th>
     		<td><input type="number" value="${dto.price}" name="price" required="required"></td>
        </tr>
        <tr class="info">
            <th>도서 이미지</th>
       	    <td><img src="./image/${dto.image}" width="140px" height="140px">
       	    	<input type="file" name="image" >
       	    	<input type="hidden" name="deleteimage" value="${dto.image}" >
       	    </td>
        </tr>
    </tbody> 
  </table>
 		<button type="submit" class="btn btn-primary">수정</button>
    	<button type="button" class="btn btn-danger" onclick="location.href='main'">취소</button>
  </form>
</div>
<center>
<img src="./image/ohm18.gif" width="300px" height="300px">
</center>
</body>
</html>