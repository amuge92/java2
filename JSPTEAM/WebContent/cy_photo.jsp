<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="kor">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA_Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
html, body {
	margin: 0px;
	padding: 0px;
	margin-left: 12px;
	position: relative;
	width: 680px;
	/* overflow: hidden; */
}

.box {
	margin: auto;
	padding: 0px 10px;
	clear: both;
}

.writer_fontcolor {
	color: #48688f;
}

.t1 {
	margin-left: 100px;
}

.td_align {
	text-align: left;
}

.th_align {
	text-align: left;
}

.s1 {
	color: #ff6801;
	font-size: 14px;
}

.td_font {
	color: #888888;
	font-size: 12px;
}

.footer_btn1 {
	float: left;
	margin-top: 1px;
}

.footer_btn2 {
	float: right;
	margin-top: 3px;
}

.table_top1 {
	color: #888888;
	margin-top: 10px;
	float: left;
	font-size: 15px;
}

.table_top2 {
	color: #ff6801;
	margin-top: 10px;
	float: right;
	font-size: 12px;
}

.top {
	margin-top: 25px;
	background: #f4f4f6;
	border-radius: 5px;
	padding: 5px 0px 5px 10px;
}

.top_child {
	text-align: left;
}

a {
	text-decoration: none;
}

#fooo {
	position: fixed;
	right: 10px;
	top: 500px;
}

.small {
	font-size: small;
	font-weight: bold;
	color: black;
}

#div {
	background-image: url("C:/Users/Lee/Desktop/HTML teamp/진첩배.jpg");
	background-size: cover;
	z-index: 1;
	nav-index: 1;
}

#div:nth-child(even) {
	transform: rotate(5deg);
}
</style>
</head>

<body>
	<div class="top">
		<div class="top_child">
			<select>
				<option>나의 사진 앨범</option>
				<option>잠금 앨범</option>
			</select> <img src="폴더관리.PNG">
		</div>

	</div>
	<span class="table_top1"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 일촌,싸이친구,단짝친구
		공개 폴더입니다 </span>
	<span class="table_top2">${fn:length(vcontents) } </span>


	<div class="box">
		<hr>
		<c:forEach items="${vcontents }" var="photo" varStatus="ps">
			<div id="div" class="diva"
				style="margin: 10px 15px; box-shadow: 3px 10px 3px gray; text-align: center; padding: 5px; display: inline-block; width: 130; height: 130; background-color: aquamarine;">
				<img width="120" height="120" src="${photo.getPhoto_src() }"><br>
				<span class="small">${photo.getPhoto_name() }</span>
			</div>
		</c:forEach>
	</div>

	</div>
	<hr>
	<div id="fooo">
		<span class="footer_btn1"> <img src="버튼.PNG">
		</span> <span class="footer_btn2"> <a href="작성폼경찬.html"> <img
				src="이동삭제글.PNG">
		</a> <span> </span> <br> <img src="footer.PNG">
	</div>
	<script>
		
	</script>
</body>

</html>