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
<h3>개인 정보 입력</h3>
<form action="scoreinfosave" method="post" >
    <div class="input-group">
      <span class="input-group-addon">학번</span>
      <input type="text" class="form-control" name="num" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">이름</span>
      <input  type="text" class="form-control" name="name" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">전화번호</span>
      <input  type="text" class="form-control" name="phone" >
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