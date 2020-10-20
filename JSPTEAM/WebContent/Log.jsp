<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<head>
<style>
html {
	background-color: black;
	width: 80%;
	/* background-image: url("C:/Users/Lee/Desktop/HTML teamp/싸22.jpg"); */
	/* background-repeat: no-repeat; */
	height: 100%;
	/* background-size: contain; */
	margin: auto;
}
</style>
<script>
	function pop() {
		window.open("Logpop.jsp", "pop",
				"width=400, height=280, left=100, top=100")
		// left와 top는 브라우저 왼쪽 상단부터 출발하여 팝업창의 위치를 정해줌
	}
</script>
</head>

<body>

	<div
		style="background-color: #f8f8f8; display: inline-block; height: 650px; width: 650px; border-radius: 650px; z-index: 0; left: 385px; top: 60px; position: fixed;">
		<img src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/싸1.jpg" width="300"
			style="position: relative; border: none; left: 170px; top: 200px;">
	</div>
	<input
		style="outline: none; background-color: #f8f8f8; font-size: xx-large; border: none; border-radius: 10px; left: 660px; top: 500px; position: fixed;"
		type="button" value="로그인" onclick="pop();" />
</body>

</html>