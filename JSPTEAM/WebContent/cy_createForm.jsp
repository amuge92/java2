<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="eng">
<head>

<style>
body {
	overflow: hidden;
}

.al {
	border: solid 1px pink
}

.title {
	text-align: center;
}

#group button {
	border: 1px solid skyblue;
	background-color: white;
	color: skyblue;
	padding: 5px;
}

#btn1:hover {
	background-color: skyblue;
	color: white;
}

#btn2:hover {
	background-color: skyblue;
	color: white;
}

#btn3:hover {
	background-color: skyblue;
	color: white;
}

img {
	position: relative;
	top: 7px
}

.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 20px;
}

a:link {
	color: black;
}

a:visited {
	color: black;
}

a {
	text-decoration: none;
}

#yuqi {
	box-sizing: 10px;
	border: 2px solid skyblue;
	border-radius: 5px;
	resize: none;
}

#ccc {
	color: skyblue;
}

#ddd {
	color: skyblue;
}

body {
	margin-left: 11px;
	width: 100%;
}

.body1 {
	background-size: cover;
}

.eve {
	border: 1px solid black;
	width: 100%;
	height: 500px;
	background: #000000;
	opacity: 0;
}

.eve p {
	padding-top: 150px;
}

.body1:hover .eve {
	opacity: 0.5;
	text-align: center;
	color: #ffffff;
}
</style>
</head>

<body class="body1" onload="on()">
	<div class="eve" id="Soo" onclick="hide()">
		<p style="font-size: 50px;">환영합니다!</p>
	</div>
	<div id="show">
		<h1 class="title">게시물 작성하기!</h1>
		<div id="ccc">
			게시판을 선택하세요 <select id="write" name="boardvalue">
				<option value="1">게시판</option>
				<option value="2">쥬크박스</option>
				<option value="3">비디오</option>
				<option value="4">사진첩</option>
			</select>
		</div>
		<br> <label id="ddd">제목 : <input name="name" id="title"
			type="text" size="30" placeholder="제목을 입력해주세요"></label> <select
			id="fontvalue" onchange="fv()">
			<option value="default" style="font-family: default;">기본</option>
			<option value="굴림" style="font-family: 굴림;">굴림</option>
			<option value="궁서" style="font-family: 궁서;">궁서</option>
			<option value="바탕" style="font-family: 바탕;">바탕</option>
			<option value="Impact" style="font-family: Impact;">Impact</option>
		</select> <select id="fontsize" onchange="fs()">
			<option value="13px" style="font-size: 10px;">크기</option>
			<!--기본크기 10xp로 지정-->
			<option value="14px" style="font-size: 14px;">14px</option>
			<option value="18px" style="font-size: 18px;">18px</option>
			<option value="24px" style="font-size: 24px;">24px</option>
			<option value="30px" style="font-size: 30px;">30px</option>
		</select> <select id="fontcolor" onchange="fc()">
			<option>색 선택</option>
			<option value="red" style="color: red;">빨간색</option>
			<option value="orange" style="color: orange;">주황색</option>
			<option value="yellow" style="color: yellow;">노랑색</option>
			<option value="green" style="color: green;">초록색</option>
			<option value="blue" style="color: blue;">파랑색</option>
			<option value="navy" style="color: navy;">남색</option>
			<option value="purple" style="color: purple;">보라색</option>

		</select> <img id="le" onclick="le()" src="게 (2).png" height="25" width="25">
		<img id="ce" onclick="ce()" src="게 (1).png" height="25" width="25">
		<img id="ri" onclick="ri()" src="게 (3).png" height="25" width="25">
		<br> <br> <input type="file" name="file" accept="image/*">
		<br>
		<!--이미지 파일만 허용-->
		<br>
		<hr>
		<br>
		<textarea style="width: 650px; height: 200px;" name="src" id="yuqi"
			placeholder="내용을 입력해주세요"></textarea>
		<br>



		<div id="group">
			<button id="btn1" type="submit" onclick="sub()">작성완료</button>
			<button id="btn2" type="reset" onclick="history.go(-1)">이전
				페이지</button>
			<button id="btn3" type="button" onclick="change()">다크모드</button>
		</div>



		<div class="footer" style="font-size: 8px;">
			&copy; 2020-06-22~<span id="today"></span> 1팀 팀원분들 항상 감사합니다. 아이콘은 <a
				href="https://icons8.com/icons">무료 아이콘 사이트</a>에서 받았습니다.
		</div>
	</div>
	<script>
		function fs() {
			var size = document.getElementById("fontsize");
			var m = document.getElementById("yuqi");
			var b = size.selectedIndex;
			m.style.fontSize = size.options[b].value;
		}
		function fc() {
			var color = document.getElementById("fontcolor");
			var m = document.getElementById("yuqi");
			var b = color.selectedIndex;
			m.style.color = color.options[b].value;
		}
		function fv() {
			var val = document.getElementById("fontvalue");
			var m = document.getElementById("yuqi");
			var b = val.selectedIndex;
			m.style.fontFamily = val.options[b].value
		}
		function le() {
			var m = document.getElementById("yuqi");
			m.style.textAlign = "left"
		}

		function ce() {
			var m = document.getElementById("yuqi");
			m.style.textAlign = "center"
		}

		function ri() {
			var m = document.getElementById("yuqi");
			m.style.textAlign = "right"
		}
		//제목이 없으면 오류날수있도록
		function sub() {
			var n = document.getElementById("title").value;
			var m = document.getElementById("yuqi").value;
			if (n == "") {
				alert("제목을 입력해주세요");
			} else if (m == "") {
				alert("내용이 비어있습니다.")
			} else {
				setTimeout(function() {
					alert("게시물 등록 완료!");
					window.location = "Mainservlet?command=createAction";
					//jsp,db연동되는 함수 짤곳
					//초기화면으로 돌아가는함수
				}, 2000);
			}
		}
		var col = "gray";
		function change() {
			if (col == "gray") {
				document.body.style.backgroundColor = col;
				col = "white";
			} else if (col == "white") {
				document.body.style.backgroundColor = col;
				col = "gray"
			}
		}
		function on() {
			var bod = document.getElementById("body2")
			var t = new Date();
			var day = t.getFullYear() + "-" + (t.getMonth() + 1) + "-"
					+ t.getDate();
			var sp = document.getElementById("today");
			sp.innerHTML = day
		}
		function hide() {
			var hide = document.getElementById("Soo");
			var show = document.getElementById("show");
			hide.style.display = "none";
			show.style.display = "block";
		}
		var show = document.getElementById("show");
		show.style.display = "none";
	</script>
</body>
</html>