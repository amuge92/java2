<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<script type="text/javascript">
	
</script>
<style>
html, body {
	margin: 0px;
	padding: 0px;
	margin-left: 12px;
	position: relative;
	width: 680px;
}

.box {
	margin: auto;
	padding: 0px 10px;
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
	padding: 4px 0px 8px 10px;
}

.top_child {
	text-align: left;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>

	<div class="box">
		<div class="top">
			<div class="top_child">
				<select>
					<option>소소한 일상</option>
					<option>서울 맛집</option>
					<option>여행 기록</option>
				</select> <input type="button" value="폴더관리"
					style="font-size: 1px; background-color: white; border: solid 1px #aaaaaa; border-radius: 3px;">
			</div>
		</div>
		<br> <br> <span
			style="font-weight: bolder; font-size: 13px;">${board.getBoard_name() }</span>
		<input type="button" value="주소복사"
			style="font-size: 1px; background-color: white; border: solid 1px #aaaaaa; border-radius: 3px;">
		<input type="button" onclick="location.href='ckeditor.html'"
			value="수정"
			style="font-size: 1px; background-color: white; border: solid 1px #aaaaaa; border-radius: 3px;">

		<hr style="border: 0; height: 1px; background: #aaaaaa;">
		<span style="font-size: 12px; color: #48688f;">${board.getBoard_writer() }</span>

		<div style="display: inline; float: right;">
			<span style="font-size: 12px;">${board.getBoard_date() }</span> <span
				style="font-size: 12px; color: #888888;">스크랩</span> <span
				style="font-size: 12px; color: #ff6801;">${board.getBoard_cnt() }</span>
		</div>
		<hr style="border: 0; height: 1px; background: #f1eff2;">
		${board.getBoard_src() } 
		<br>
		<div
			style="display: inline; font-size: 10px; border-radius: 3px; padding: 2px; background: #858fa9; color: white;">
		이건가</div>

		&nbsp;
</body>
</html>