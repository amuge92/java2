<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="kor">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	function onplay1(e){
		var id = 'au'+e;
		var i = document.getElementById(id);
			i.load();
			i.play();
		};
	</script>


<style>
html, body {
	margin: 0px;
	padding: 0px;
	margin-left: 12px;
	position: relative;
	width: 680px;
}

.table2 {
	width: 100%;
	border-collapse: collapse;
	margin-top: 5px;
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
	border-top: 1px solid #e0e0e0;
}

.artist_fontcolor {
	color: #48688f;
}

.td_align {
	text-align: left;
}

.th_align {
	text-align: left;
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
	color: #ff6801;
	font-size: 10px;
}

.table_top2 {
	color: #888888;
	font-size: 15px;
}
td{
align-content: center;}
a {
	text-decoration: none;
}
</style>
</head>

<body>
	<div>
		<span class="table_top1">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; * </span> <span
			class="table_top2" style="font-size: 10px;"> 전체공개
			폴더입니다.${fn:length(vcontents)} </span>
	</div>

	<table class="table2">
		<thead>
			<tr style="background-color: #f2f2f2;">
				<th><input type="checkbox" checked="checked"></th>
				<th>번호</th>
				<th></th>
				<th class="th_align">곡명</th>
				<th class="th_align">아티스트</th>
			</tr>
		</thead>

		<c:forEach var="music" items="${vcontents }" varStatus="ms">
			<tr>
				<td align="center"><audio hidden='hidden' id="au${music.getvNum()}"
						src="${music.getMusic_src()}"></audio><input type="checkbox"></td>
				<td align="center">${music.getvNum()}</td>
				<td height="0">
					<div style="height: 100%">
						<img id="track${music.getvNum()}"
							onclick="onplay1(${music.getvNum()})"
							src="http://drive.google.com/uc?export=view&id=1xsCpiXsXSWTVlwwdaNYvNnbt5GGU6ig4"
							style="height: 100%; width: 25px;">
					</div>
				</td>
				<td class="td_align">${music.getMusic_name() }</td>
				<td class="td_align"><span class="artist_fontcolor">${music.getMusic_writer() }</span></td>
			</tr>
		</c:forEach>
	</table>

	<div></div>
	</div>
</body>

</html>