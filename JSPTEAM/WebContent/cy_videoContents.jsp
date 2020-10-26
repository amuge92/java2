<%@page import="lee.bean.cy_videobean"%>
<%@page import="java.util.Vector"%>
<%@page import="lee.CyDAO.cy_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="kor">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA_Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	function li() { // 마우스 클릭시 목록으로 이동
		history.go(-1);
	}
	function on() {
		var time = new Date(); // 날짜
		var comment = document.querySelector(".bottom");
		var t = document.getElementById("tex").value;
		t = "이름: " + t;
		t += '<br>';

		comment.innerHTML += t;
	}
</script>
<style>
html, body {
	margin: 0px;
	padding: 0px;
	margin-left: 12px;
	position: relative;
}

.box {
	text-align: center;
	margin: auto;
	padding: 0px 10px;
	background-color: #e8e7e5;
	width: 90%;
}

.bottom {
	position: relative;
	background-color: #e8e7e5;
	font-size: small;
	margin-top: 60px;
}

.vi {
	width: 500px;
	height: 400px;
	margin-left: 15%;
}

.su {
	text-align: left;
	font-size: small;
	color: blue;
}

.date {
	float: right;
	color: black;
	font-size: x-small;
}

#li, input[type=submit] {
	float: right;
	background-color: white;
	border-radius: 3px;
	font-size: x-small;
}
</style>
</head>


<body>
	<div class="box">
		<p class="ss">
			<span>${video.getVideo_name()}</span><br>
		<p class="su">
			<span class="name"> ${video.getVideo_writer()} </span> <span
				class="date"> ${video.getVideo_date()}</span>
		</p>
	</div>
	<div class="video">
		<video
		src='${video.getVideo_src()}'
			 controls class="vi"></video>
	</div>
	<div class="bottom">
		<span>comment</span><input type="text" size="70px" class="te" id="tex">
		<input type="button" id="li" value="목록" onclick="li()"> <input
			type="submit" onclick="on()" value="확인">
		<table>
			<tr>
				<td class="comment">
					${video.getVideo_comment()}
					</td>
			</tr>
		</table>
	</div>
</body>

</html>