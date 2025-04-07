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
  <h2>삭제 정보</h2>
  <p>삭제를 진행할 자료가 맞는지 확인해주세요 [한 번 삭제하면 되돌릴 수 없어요]</p>
  <form action="bookdeletego" method="post" enctype="multipart/form-data">
  <table class="table">
    <tbody>
      <tr class="danger" >
     		<th>도서번호</th>
       		<td><input type="text" value="${dto.booknumber}" name="booknumber" readonly="readonly"></td>
       	</tr>
        <tr class="danger">
     		<th>도서명</th>
     		<td><input type="text" value="${dto.bookname}" name="bookname" readonly="readonly"></td>
        	<td></td>
        </tr>
        <tr class="danger">
     		<th>저자명</th>
     		<td><input type="text" value="${dto.writer}" name="writer" readonly="readonly"></td>
        </tr>
       	<tr class="danger">
     		<th>도서 내용</th>
     		<td><input type="text" value="${dto.memo}" name="memo" readonly="readonly"></td>
        </tr>
        <tr class="danger">
     		<th>도서 가격</th>
     		<td><input type="number" value="${dto.price}" name="price" readonly="readonly"></td>
        </tr>
        <tr class="danger">
            <th>도서 이미지</th>
       	    <td><img src="./image/${dto.image}" width="140px" height="140px">
       	    	<input type="hidden" name="deleteimage" value="${dto.image}" >
       	    </td>
        </tr>
    </tbody> 
  </table>
 		<button type="submit" class="btn btn-danger" >삭제</button>
    	<button type="button" class="btn btn-primary" onclick="location.href='main'">취소</button>
  </form>
</div>
<center>
<img src="./image/ohm20.gif" width="300px" height="300px">
</center>
</body>
</html>