<%@page import="java.util.Vector"%>
<%@page import="lee.CyDAO.cy_DAO"%>
<%@page import="lee.bean.cy_videobean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title></title>
<script>
	function video2() { // 클릭시 비디오 2로 이동
	}
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
	text-align: center;
	margin: auto;
	padding: 0px 10px;
	/*위 아래, 오른쪽 왼쪽*/
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, tfoot {
	border-bottom: 1px solid black;
}

.writer_fontcolor {
	color: #858fa9;
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
</style>
</head>

<body>
	<div class="box">
		<div class="top">
			<div class="top_child">
				<select>
					<option>비디오 앨범</option>
					<option>잠금 앨범</option>
				</select> <img src="C:/Users/Lee/Desktop/HTML teamp/폴더관리.PNG">
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
			공개 폴더입니다 </span> <span class="table_top2">[${fn:length(vcontents)}] </span>
		<table>
			<thead>
				<tr>
					<th><input type="checkbox" checked="checked"></th>
					<th></th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>
			</thead>
			<c:forEach items="${vcontents }" var="vcon" varStatus="vc">
				<tr>
					<td><input type="checkbox"></td>
					<td>${vc.count}</td>
					<td style="cursor: pointer;"
						onclick="location.href='Mainservlet?command=cy_videoContents.jsp&vNum=${vcon.getvNum()}'">
						${vcon.getVideo_name()}</td>
					<td><span class="writer_fontcolor">${vcon.getVideo_writer()}</span></td>
					<td>${vcon.getVideo_date()}</td>
					<td>${vcon.getVideo_cnt()}</td>
				</tr>
			</c:forEach>
		</table>
		<div id="fooo">
			<span class="footer_btn1"> <img
				src="C:/Users/Lee/Desktop/HTML teamp/버튼.PNG">
			</span> <span class="footer_btn2"> <a href="작성폼경찬.html"> <img
					src="C:/Users/Lee/Desktop/HTML teamp/이동삭제글.PNG"> <span></a>
			</span> <br> <img src="C:/Users/Lee/Desktop/HTML teamp/footer.PNG">
		</div>
	</div>
	<script type="text/javascript">
	</script>
</body>

</html>