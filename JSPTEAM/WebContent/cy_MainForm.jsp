<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html lang="kor">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA_Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<head>
<script type="text/javascript">
	var a = [
			"https://drive.google.com/uc?export=download&id=1SDMzuQhmzQJ30kHktrgtnh1nP4zzn9m0",
			"https://drive.google.com/uc?export=download&id=1rbdcGIN8Au5HHKkuydx7dGYKGmDzWYye",
			"https://drive.google.com/uc?export=download&id=1P_s80KlFy1jtAipzDzXVuFSF1B6ZAm6e",
			"https://drive.google.com/uc?export=download&id=1ePCru9LtH6fgu4d3q91sOceOqXHRQsCv" ];
	var play = 0;

	var stop = 0;
	$(document).ready(function() {
		$('#play').click(function() {
			if (stop == 0) {
				$('#music')[0].play();
				$('#play').text("일시 정지");
				stop++;

			} else {
				$('#music')[0].pause();
				$('#play').text("음악 재생");
				stop--;
			}
		})
		$('#next').click(function() {
			$('#music').attr("src", a[play % 4]);
			play++;
			$('#music')[0].load();
			$('#music')[0].play();
		})
	});
</script>
<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
	height: 100%;
	/* overflow: hidden; */
}

@
keyframes anime { 0% {
	background-image:
		url("file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/1.jpg");
}

55
%
{
background-image
:
url("file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/2.jpg")
;
}
100
%
{
background-image
:
url("file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/1.jpg")
;
}
}
html {
	margin: 0px;
	padding: 0px;
	background-color: black;
	/* overflow: hidden; */
	position: fixed;
	background-image:
		url("file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/1.jpg");
	animation: anime 10s alternate-reverse infinite;
	background-size: cover;
	background-repeat: no-repeat;
	height: 100%;
	width: 100%;
}

.box {
	padding: 10px;
	opacity: 0.9;
	position: fixed;
	width: 1090px;
	height: 550px;
	background-color: whitesmoke;
	left: 55px;
	top: 32px;
	border-radius: 10px;
}

.box2 {
	padding: 10px;
	opacity: 1;
	position: fixed;
	width: 1103px;
	height: 565px;
	left: 45px;
	top: 22px;
	border-radius: 10px;
	border: 3px dashed deepskyblue;
}

.left {
	opacity: 0.9;
	z-index: 2;
	position: fixed;
	width: 300px;
	height: 608px;
	background-color: whitesmoke;
	left: 70px;
	top: 90px;
	border-radius: 12px;
	box-shadow: 0px 0px 10px black;
}

.main {
	opacity: 0.9;
	z-index: 2;
	position: fixed;
	width: 763px;
	height: 608px;
	background-color: whitesmoke;
	left: 380px;
	top: 90px;
	border-radius: 12px;
	box-shadow: 0px 0px 10px black;
}

.mini {
	opacity: 0.7;
	position: fixed;
	width: 235px;
	height: 170px;
	background-color: #fdfffe;
	left: 1230px;
	top: 10px;
	border-radius: 5px;
	box-shadow: 3px 3px 10px hotpink;
}

.maini {
	opacity: 1;
	display: block;
	position: fixed;
	width: 710px;
	height: 570px;
	border: none;
	top: 120px;
	border-radius: 5px;
	left: 400px;
}

.iframel {
	display: block;
	position: fixed;
	width: 280px;
	height: 570px;
	border: none;
	top: 120px;
	left: 80px;
	border-radius: 5px;
}

#cy {
	margin-left: 15px;
	margin-top: 10px;
	letter-spacing: 2px;
	font-size: x-large;
	font-weight: bold;
	color: cornflowerblue;
}

table {
	width: 180px;
}

td#a {
	padding-top: 10px;
}

td:hover {
	cursor: pointer;
	color: orange;
}

#link:hover {
	cursor: pointer;
}

#link {
	display: inline-block;
	margin: 10px;
	color: orangered;
}
</style>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA_Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>
	<form>
		<div class="box2"></div>
		<div class="box" style="position: relative;">
			<span
				style="font-size: x-small; position: fixed; left: 160px; top: 70px;">TODAY
				<n style="color: red;">0 </n>명 &nbsp; | &nbsp; TOTAL 0명
			</span> <span id="cy" style="position: fixed; left: 380px;"> 사이좋은
				사람들. 싸이월드</span> <span
				style="float: right; margin-right: 10px; margin-top: 10px;"><span
				id="link">◈일촌맺기</span> <span id="link">◈즐겨찾기</span> </span>

		</div>
		<div class="left">
			<iframe id="left" class="iframel"
				src="Mainservlet?command=cy_homeLE.jsp"></iframe>
		</div>
		<div class="main">
			<iframe id="main" class="maini" src="Mainservlet?command=cy_home.jsp"></iframe>
		</div>
		<div class="mini">
			<table>
				<tr>
					<td id="a">스크랩 게시물</td>
				</tr>
				<tr>
					<td>즐겨찾기</td>
				</tr>
				<tr>
					<td>사용중인 아이템</td>
				</tr>
				<tr>
					<td>도토리 충전</td>
				</tr>
			</table>

			<audio controls
				src="https://drive.google.com/uc?export=download&id=1ePCru9LtH6fgu4d3q91sOceOqXHRQsCv"
				style="width: 235px; height: 15px; bottom: -45px; position: relative;"
				id="music">
			</audio>

		</div>
		<div
			style="z-index: 3; left: 1230px; line-height: 30px; background-color: darkgrey; width: 235px; height: 30px; top: 135px; position: fixed;">
			<img style="float: left;" width="30px" height="30px"
				src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/음악.jpg">
			<img id="next" style="float: right; margin-right: 0.5px;"
				width="30px" height="30px"
				src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/다음곡.jpg">
			<label id="play"> 음악 재생</label>
		</div>



		<div class="ritag" onclick="video(this)" id="hh1"
			style="cursor: pointer; opacity: 0.95; border: 1px solid grey; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 3; border-radius: 0px 10px 10px 0px; top: 120px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: whitesmoke; color: royalblue;">
			홈</div>
		<div class="ritag" onclick="video(this)" id="hh2"
			style="cursor: pointer; opacity: 0.95; border: 1px solid black; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 1; border-radius: 0px 10px 10px 0px; top: 170px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: royalblue; color: whitesmoke;">
			게시판</div>
		<div class="ritag" onclick="video(this)" id="hh3"
			style="cursor: pointer; opacity: 0.95; border: 1px solid black; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 1; border-radius: 0px 10px 10px 0px; top: 220px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: royalblue; color: whitesmoke;">
			쥬크박스</div>
		<div class="ritag" onclick="video(this)" id="hh4"
			style="cursor: pointer; opacity: 0.95; border: 1px solid black; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 1; border-radius: 0px 10px 10px 0px; top: 270px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: royalblue; color: whitesmoke;">
			비디오</div>
		<div class="ritag" onclick="video(this)" id="hh5"
			style="cursor: pointer; opacity: 0.95; border: 1px solid black; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 1; border-radius: 0px 10px 10px 0px; top: 320px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: royalblue; color: whitesmoke;">
			방명록</div>
		<div class="ritag" onclick="video(this)" id="hh6"
			style="cursor: pointer; opacity: 0.95; border: 1px solid black; border-left: none; box-shadow: 3px 6px 5px -2px #666; text-align: center; z-index: 1; border-radius: 0px 10px 10px 0px; top: 370px; left: 1143px; clear: both; position: fixed; width: 75px; height: 40px; line-height: 40px; font-weight: bold; background-color: royalblue; color: whitesmoke;">
			사진첩</div>

	</form>

	<script>
		function video(e) {
			var pick = [ "hh1", "hh2", "hh3", "hh4", "hh5", "hh6" ];
			var pickmain = [ "Mainservlet?command=cy_home.jsp",
					"Mainservlet?command=cy_board.jsp",
					"Mainservlet?command=cy_music.jsp",
					"Mainservlet?command=cy_video.jsp",
					"Mainservlet?command=cy_visitor.jsp",
					"Mainservlet?command=cy_photo.jsp" ];
			var pickleft = [ "Mainservlet?command=cy_homeLE.jsp",
					"Mainservlet?command=cy_boardLE.jsp",
					"Mainservlet?command=cy_musicLE.jsp",
					"Mainservlet?command=cy_videoLE.jsp",
					"Mainservlet?command=cy_visitorLE.jsp",
					"Mainservlet?command=cy_photoLE.jsp" ];
			var ee = document.getElementsByClassName("ritag");
			for (i = 0; i < ee.length; i++) {
				ee[i].style.backgroundColor = "royalblue"
				ee[i].style.color = "whitesmoke";
				ee[i].style.zIndex = 1;
			}

			e.style.backgroundColor = "whitesmoke";
			e.style.color = "royalblue";
			e.style.zIndex = 3;

			var main = document.getElementById("main");
			var left = document.getElementById("left");
			for (i = 0; i < pick.length; i++) {
				if (e.id == pick[i]) {
					main.src = pickmain[i];
					left.src = pickleft[i];
				}
			}
		}
	</script>
</body>

</html>