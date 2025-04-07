<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
</head>
<body>
<div class="container">
  <h3>도서 입력</h3>
<form action="booksave" method="post" enctype="multipart/form-data">
    <div class="input-group">
      <span class="input-group-addon">도서명</span>
      <input type="text" class="form-control" name="bookname" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">저자명</span>
      <input  type="text" class="form-control" name="writer" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">도서내용</span>
      <input  type="text" class="form-control" name="memo" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">도서가격</span>
      <input  type="number" class="form-control" name="price" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">도서이미지</span>
      <input  type="file" class="form-control" name="image" >
    </div>
    <div>
    <button type="submit" class="btn">전송</button>
    <button type="reset" class="btn btn-danger">취소</button>
    </div>
  </form>
<center>
<img src="./image/flog2.gif" width="300px" height="300px">
</center>
</body>
</html>