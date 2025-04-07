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
  <h3>사원 정보 입력</h3>
<form action="companysave" method="post">
    <div class="input-group">
      <span class="input-group-addon">사원명</span>
      <input  type="text" class="form-control" name="name" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">주민번호</span>
      <input  type="text" class="form-control" name="jumin" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">입사날짜</span>
      <input  type="date" class="form-control" name="day" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">가족수</span>
      
  	<select class="form-control" id="sel1" name="family">
   		<option>1명</option>
    	<option>2명</option>
   		<option>3명</option>
    	<option>4명이상</option>
  	</select>
    </div>
     <div class="input-group">
      <span class="input-group-addon">직위</span>
      <select class="form-control" id="sel2" name="rank">
   		<option>사원</option>
    	<option>대리</option>
   		<option>과장</option>
    	<option>부장</option>
  	</select>
    </div>
    <div>
    <button type="submit" class="btn">전송</button>
    <button type="reset" class="btn btn-danger">취소</button>
    </div>
  </form>
<center>
<img src="./image/do1.gif" width="300px" height="300px">
</center>
</body>
</html>