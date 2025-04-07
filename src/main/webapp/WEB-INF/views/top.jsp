<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

  <title>Bootstrap Example</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style type="text/css">

.title{
    max-width:100vw;
    height: 150px;      
    border-top: 1px solid rgba(255, 255, 255, 0.6);
    border-bottom: 1px solid rgba(255, 255, 255, 0.6);
    position:relative;
    overflow:hidden;    
    }
.t_text {
    width: auto;
    height: auto;
    font-size: 50px;
    font-weight: bold;
    color: #fff8dc;
    text-shadow:
    -1px -1px 0 #000,
    1px -1px 0 #000,
    -1px 1px 0 #000,
    1px 1px 0 #000;  
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate( -50%, -50% );
}
.img1{
    width: 100%;
    height: 100%;
    object-fit: cover; /* 비율 유지하면서 꽉 차도록 */
    }
table{
border-collapse: collapse;
text-align: center;
}
</style>

</head>
<body>
<header>
<div class = title>
 <div class="t_img">

<img class = "img1" src="./image/see12.gif">
</div>
    <div class="t_text">
      <p>Program</p>
    </div>
</div>
</header>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="main">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">회원관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="memberinput">회원 자료 입력</a></li>
          <li><a href="memberout">회원 자료 출력</a></li>
           
        </ul>
      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">도서관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="bookinput">도서 자료 입력</a></li>
          <li><a href="bookout">도서 자료 출력</a></li>
          <li><a href="booksearch">도서 자료 검색</a></li>
    </ul>
    </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">사원관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="companyinput">사원 자료 입력</a></li>
          <li><a href="companyout">사원 자료 출력</a></li>
          <li><a href="companysearch">사원 자료 검색</a></li>
          </ul>
          </li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">성적관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="scoreinput">성적 자료 입력</a></li>
          <li><a href="scoreout">성적 자료 출력</a></li>
          </ul>
          </li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">상품구매관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="myinfoinput">개인 정보 입력</a></li>
          <li><a href="myinfoout">개인 정보 출력</a></li>
          <li><a href="sanginput">상품 자료 입력</a></li>
          <li><a href="sangout">상품 자료 출력</a></li>
          <li><a href="snametotal">상품별 합계</a></li>
          <li><a href="daysnametot">날짜별 상품 합계</a></li>
          <li><a href="mytot">개인 정보 활용 구입 내역</a></li>
          </ul>
          </li>
             <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">성적관리 2<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="scoreinfoinput">개인 정보 입력</a></li>
          <li><a href="scoreinput1">성적 정보 입력</a></li>
          <li><a href="scoreinfoout">정보 출력</a></li>
          </ul>
          </li>
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">게시판<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="announcementinput">공지사항 입력</a></li>
          <li><a href="announcementout">공지사항 출력</a></li>
          <li><a href="boardinput">글쓰기</a></li>
          <li><a href="boardout">게시판 보기</a></li>
          </ul>
          </li>
    </ul>
    
    <ul class="nav navbar-nav navbar-right">
    <c:choose>
    	<c:when test="${loginstate}"> <!-- 로그인 된 상태 -->
    	<li><a href=""><span class="glyphicon glyphicon-user"></span> ${id}님 반가워요</a></li> <!-- httpSission 안에 있는 값을 el 표기법으로 출력 -->
      <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> 로그아웃</a></li>
    	</c:when>
    	<c:otherwise> <!-- 로그인 안된 상태 -->
    	<li><a href="memberinput"><span class="glyphicon glyphicon-user"></span>회원가입</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> 로그인</a></li>
    	</c:otherwise>
    </c:choose>
      
    </ul>
  </div>
</nav>
  
<div class="container">

</div>

</body>
</html>