<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript">
	
	$(document).ready(function() {
		$("#idcheck").click(function() {
			var id = $("#id").val();
			$.ajax({
				type:"post",
				url:"idcheck",
				data:{"id":id},
				async:true,
				success:function(data){
					if(data=='ok'){
						alert("사용가능 ID 입니다")
					}
					else{
						
						alert("사용중인 ID 입니다. 다른 아이디를 입력해주세요")
					}
				}
			});
			
		});
	});

	
	</script>
</head>
<body>
<div class="container">
  <h3>회원가입</h3>
  <p>입력하신 정보는 철저한 보안으로 지켜드립니다.</p>
<form action="membersave" method="post" enctype="multipart/form-data">
    <div class="input-group">
  <span class="input-group-addon">
    <i class="glyphicon glyphicon-user"></i>
  </span>
  <input id="id" type="text" class="form-control" name="id" placeholder="ID">
  <span class="input-group-btn">
    <button type="button" id="idcheck" class="btn btn-secondary">ID중복검사</button>
  </span>
</div>
    <div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
      <input id="password" type="password" class="form-control" name="password" placeholder="Password">
    </div>
    
    <div class="input-group">
      <span class="input-group-addon">Name</span>
      <input id="name" type="text" class="form-control" name="name" placeholder="Name">
    </div>
    <div class="input-group">
      <span class="input-group-addon">Age</span>
      <input id="age" type="number" class="form-control" name="age" placeholder="age">
    </div>
    <div>
    <button type="submit" class="btn">전송</button>
    <button type="reset" class="btn btn-danger">취소</button>
    </div>
  </form>
<center>
<img src="./image/do2.gif" width="300px" height="300px">
</center>
</body>
</html>