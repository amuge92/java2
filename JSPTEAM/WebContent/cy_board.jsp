<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<style>
html, body {
	margin: 0px;
	padding: 0px;
	margin-left: 12px;
	position: relative;
	width: 680px;
}

.box {
	text-align: center;
	margin: auto;
	padding: 0px 10px;
}

.table2 {
	width: 100%;
	border-collapse: collapse;
	margin-top: 40px;
}

.table2 th {
	height: 25px;
}

.table2 tr td {
	height: 25px;
}

th, tfoot {
	border-bottom: 1px solid #e0e0e0;
}

thead {
	border-bottom: 1px solid #e0e0e0;
	border-top: 1px solid #858fa9;
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
		<span class="table_top1"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; 일촌,싸이친구,단짝친구
			공개 폴더입니다 </span> <span class="table_top2">${fn:length(vcontents) }</span>

		<table class="table2">
			<thead>
				<tr>
					<th><input type="checkbox" checked="checked"></th>
					<th></th>
					<th class="th_align">&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 제목</th>
					<th></th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>
			</thead>
			<c:forEach var="board" items="${vcontents }" varStatus="bs">
				<tr>
					<td><input type="checkbox"></td>
					<td class="td_font">${bs.count}</td>
					<td class="td_align">&nbsp; <a
						href="Mainservlet?command=cy_boardContent.jsp&vNum=${board.getvNum()}"
						style="color: black;">${board.getBoard_name()}</a>
					</td>
					<td></td>
					<td><span class="writer_fontcolor">${board.getBoard_writer()}</span></td>
					<td class="td_font">${board.getBoard_date()}</td>
					<td class="td_font">${board.getBoard_cnt()}</td>
				</tr>
			</c:forEach>
		</table>

		<span class="footer_btn1"> <img
			src="http://drive.google.com/uc?export=view&id=1CkOy6A5_fbRRwn_0fxexuiClVSYMfpzf">
		</span> <span class="footer_btn2"> <a
			href="Mainservlet?command=cy_createForm.jsp"> <img
				src="http://drive.google.com/uc?export=view&id=15Y4mcrjTWgWua04lPL59YvAuF8oIiJv1">
		</a>
		</span> <br>
		<table style="display: inline; text-align: center;">
			<tr>
				<td><span style="color: #888888; font-size: 10px;">|</span> <span
					style="color: #ff6801; font-size: 10px;">1</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">2</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">3</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">4</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">5</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">6</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
				<td><span style="color: black; font-size: 10px;">7</span> <span
					style="color: #888888; font-size: 10px;">|</span></td>
			</tr>
		</table>
</body>

</html>