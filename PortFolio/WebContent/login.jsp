<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <link rel="stylesheet" href="css/default.css">
    <link rel="stylesheet" href="css/style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <section class="login"> <!--X, Y축 자체가 가운데 정렬이 필요-->
        <h2>로그인</h2>
        <form action="LoginAction.login" method="post"> 
	        <ul>
	            <li> <input type="text" placeholder="아이디" title="아이디 입력" name="user_id"></li>
	            <li> <input type="password" placeholder="비밀번호" title="비밀번호 입력" name="user_pw"></li>
	            <li> <input type="checkbox" id="chk_id"><label for="chk_id">아이디저장</label></li>
	            <li> <button type="submit">로그인</button></li>
	            <li> <button id="kakao">카카오 로그인</button></li>
	        </ul>
        </form>
        
        <div>
            <ul>
                <li><a href="">회원가입</a></li>
                <li><a href="">아이디 찾기</a></li>
                <li><a href="">비밀번호 찾기</a></li>
            </ul>
        </div>
    </section>
</body>
</html>