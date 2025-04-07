<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h3>공지사항 입력</h3>
<form action="boardsave" method="post">
    <div class="input-group">
      <span class="input-group-addon">제목</span>
      <input id="title" type="text" class="form-control" name="title">
    </div>
    <div class="input-group">
      <span class="input-group-addon">작성자</span>
      <input id="writer" type="text" class="form-control" name="writer" >
    </div>
    <div class="input-group">
      <span class="input-group-addon">글내용</span>
      <input id="text" type="text" class="form-control" name="text" >
    </div>
    <div>
    <button type="submit" class="btn">전송</button>
    <button type="reset" class="btn btn-danger">취소</button>
    </div>
  </form>
</body>
</html>