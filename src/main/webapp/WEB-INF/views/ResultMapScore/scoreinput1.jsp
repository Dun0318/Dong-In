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
<h3>성적 정보 입력</h3>
<form action="scoresave1" method="post" >
    <div class="input-group">
      <span class="input-group-addon">학번</span>
      <input type="text" class="form-control" name="num" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">국어</span>
      <input  type="number" class="form-control" name="kor" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">영어</span>
      <input  type="number" class="form-control" name="eng" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">수학</span>
      <input  type="number" class="form-control" name="mat" >
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