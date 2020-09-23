<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html lang="ko">

<head>
    <style>
        span {
            display: inline-block;
            width: 200px;
        }
    </style>
</head>

<body>
<form method="post" action="MemberJoinProc.jsp">
    <span>아이디</span> : <input name="id"><br>
    <span>패스워드</span> : <input type="password" name="pass0"><br>
    <span>패스워드 확인</span> : <input type="password" name="pass1"><br>
    <span>이메일</span> : <input type="email" name="email"><br>
    <span>전화번호</span> : <input type="tel" name="tel"><br>
    <span>당신의 취미</span> : <input type="checkbox" name="hobby" value="cap">캠핑
    <input type="checkbox" name="hobby" value="rbook">독서
    <input type="checkbox" name="hobby" value="movie">영화
    <input type="checkbox" name="hobby" value="music">음악
    <input type="checkbox" name="hobby" value="game">게임
    <br>
    <span>당신의 직업</span> : <select name="job">
        <option value="student">학생</option>
        <option value="teacher">교사</option>
        <option value="salaryman">회사</option>
        <option value="GODsu">백수</option>
        <option value="doctor">의사</option>
        <option value="nurse">간호사</option>
    </select><br>
    <span>당신의 연령</span> : <input type="radio" name="age" value="10대">10대
    <input type="radio" name="age" checked value="20대">20대
    <input type="radio" name="age" value="30대">30대
    <input type="radio" name="age" value="40대">40대
    <input type="radio" name="age" value="50대">50대<br>
    <span>하고싶은 말</span> : <textarea name="intro"></textarea><br>
    <input type="submit" value="회원가입">
    <input type="reset" value="취소">
    </form>
</body>

</html>
