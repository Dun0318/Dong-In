<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

td{text-align: center; color: gray;}
th{text-align: center; color: black;}
</style>
</head>
<body>

  <h2>검색</h2>
  <p>찾고자 하는 자료. 자료의 이름을 입력해주세요</p>
  <form action="booksearchgo" method="post">
  <table border="1" style="width: 400px" align="center">
  	<tr>
  		<th>자료</th>
  			<td>
  			<input type="radio" name="data" value="bookname">도서명 
  			<input type="radio" name="data" value="writer">저자명
  			</td>
  	</tr>
  	<tr>
  		<th>자료의 이름</th>
  			<td>
  			<input type="text" name="result">
  			</td>
  	</tr>
  	<tr>
  		<td colspan="2" align="center">
  		<button type="submit" class="btn btn-primary" >검색</button>
    	<button type="button" class="btn btn-danger" onclick="location.href='main'">취소</button>
    	</td>
  	</tr>
  </table>
  </form>
</body>
</html>