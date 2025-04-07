<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <style>
        .input-group {
            display: flex;
            align-items: center;
            justify-content: center; /* 가로 정렬 */
            margin: 10px 0;
        }
        .form-control {
            width: 500px; /* 기존 너비 유지 */
            padding: 10px;
            font-size: 16px;
        }
        .btn-container {
            text-align: center; /* 버튼도 가운데 정렬 */
            margin-top: 10px;
        }
    </style>
</head>
<body>

<form action="loginsave" method="post">
  <div class="input-group" >
    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input id="id" type="text" class="form-control" name="id" placeholder="ID" style="width: 500px">
  </div>
  <div class="input-group" >
    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    <input id="password" type="password" class="form-control" name="password" placeholder="Password" style="width: 500px">
  </div>
   <div>
    <button type="submit" class="btn">전송</button>
    <button type="reset" class="btn btn-danger">취소</button>
    </div>
</form>
</body>
</html>