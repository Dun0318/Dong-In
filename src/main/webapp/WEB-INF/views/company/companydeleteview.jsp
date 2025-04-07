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
  <p>삭제할 자료가 맞는지 확인해주세요</p>
  <form action="companydeletego" method="post" enctype="multipart/form-data">
  <table class="table">
       	<div class="input-group">
     		<span class="input-group-addon">사원번호</span>
       		<input type="text" value="${dto.snumber}" name="snumber" readonly="readonly" class="form-control" placeholder="Additional Info">
       	</div>
       		<div class="input-group">
     		<span class="input-group-addon">사원명</span>
       		<input type="text" value="${dto.name}" name="name" readonly="readonly" class="form-control" placeholder="Additional Info">
       	</div>
       <div class="input-group">
     		<span class="input-group-addon">주민번호</span>
       		<input type="text" value="${dto.jumin}" name="jumin" readonly="readonly" class="form-control" placeholder="Additional Info">
       	</div>
        <div class="input-group">
     		<span class="input-group-addon">입사날짜</span>
       		<input type="date" value="${dto.day}" name="day" readonly="readonly" class="form-control" placeholder="Additional Info">
       	</div>
       
        <div class="input-group">
     		<span class="input-group-addon">가족수</span>
     		<input type="text" value="${dto.family}" name="family" readonly="readonly" class="form-control" placeholder="Additional Info">
     		</div>
      
       <div class="input-group">
     		<span class="input-group-addon">직위</span>
     		<input type="text" value="${dto.rank}" name="rank" readonly="readonly" class="form-control" placeholder="Additional Info">
		  </div>
      
 		<button type="submit" class="btn btn-primary">수정</button>
    	<button type="button" class="btn btn-danger" onclick="location.href='main'">취소</button>
    	
  </form>
</div>
<center>
<img src="./image/flog3.gif" width="300px" height="300px">
</center>
</body>
</html>