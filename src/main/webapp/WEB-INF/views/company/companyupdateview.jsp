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
  <p>수정이 필요한 부분을 입력해주세요! [ 사원번호는 수정이 불가능 합니다 ])</p>
  <form action="companyupdatego" method="post" enctype="multipart/form-data">
  <table class="table">
    
       	<div class="input-group">
     		<span class="input-group-addon">사원번호</span>
       		<input type="text" value="${dto.snumber}" name="snumber" readonly="readonly" class="form-control" placeholder="Additional Info">
       	</div>
       		<div class="input-group">
     		<span class="input-group-addon">사원명</span>
       		<input type="text" value="${dto.name}" name="name" required class="form-control" placeholder="Additional Info">
       	</div>
       <div class="input-group">
     		<span class="input-group-addon">주민번호</span>
       		<input type="text" value="${dto.jumin}" name="jumin" required class="form-control" placeholder="Additional Info">
       	</div>
        <div class="input-group">
     		<span class="input-group-addon">입사날짜</span>
       		<input type="date" value="${dto.day}" name="day" required class="form-control" placeholder="Additional Info">
       	</div>
       
        <div class="input-group">
     		<span class="input-group-addon">가족수</span>
     		<select class="form-control" id="sel1" value="${dto.family}" required="required" name="family">
    		<option>1명</option>
   			<option>2명</option>
   			<option>3명</option>
    		<option>4명이상</option>
		  </select>
     		</div>
      
       <div class="input-group">
     		<span class="input-group-addon">직위</span>
          <select class="form-control" id="sel2" value="${dto.rank}" required="required" name="rank" >
    		<option>사원</option>
   			<option>대리</option>
   			<option>과장</option>
    		<option>부장</option>
		  </select>
		  </div>
      
 		<button type="submit" class="btn btn-primary">수정</button>
    	<button type="button" class="btn btn-danger" onclick="location.href='main'">취소</button>
    	
  </form>
</div>
<center>
<img src="./image/ohm18.gif" width="300px" height="300px">
</center>
</body>
</html>