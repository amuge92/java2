<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
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
<script>
	
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
	padding: 10px;
	background-color: rgb(214, 214, 214);
	display: inline-block;
}

.submit {
	background-color: white;
	border-radius: 3px;
	float: right;
	margin-left: 8px;
	padding: 12px;
}

.img {
	width: 80px;
	height: 80px;
	margin-top: 10px;
}

.ss {
	margin-top: 20px;
	font-size: x-small;
	background-color: #f7f7f7;
	border-top: solid darkgray;
	border-bottom: solid darkgray;
}

.name {
	color: blue;
}

.delete {
	float: right;
	text-decoration-line: underline;
}
</style>
</head>

<body>
	<form method="get" action="Mainservlet">
		<input hidden="hidden" name="command" value="cy_visitorInsert">
		<c:forEach items="${vcontents }" var="visit" varStatus="vs">
			<div class="top">
				<p class="ss">
					<span>no.</span> <span class="num">${visit.getvNum() }</span> <span
						class="name">${visit.getVisitor_writer() }</span> <span
						class="date">${visit.getVisitor_date() }</span>
				</p>
				<p>
					<img
						src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/방명이미지.png"
						class="img"><span>${visit.getVisitor_comment() }</span>
				</p>
			</div>
		</c:forEach>
		<div class="box">
			<textarea id="te" name="mention" cols="80%" rows="3px"
				placeholder="한마디 남겨주세요~"></textarea>
			<input type="submit" value="확인" class="submit">
		</div>
	</form>

</body>

</html>