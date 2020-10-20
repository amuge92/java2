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
}

.box {
	margin: auto;
	padding: 0px 10px;
}

td {
	border-top: 1px dotted;
}

table {
	font-size: small;
}

#mury {
	display: inline-block;
	border: 1px solid pink;
	border-radius: 5px;
	color: white;
	background-color: hotpink;
}

#che {
	font-size: x-small;
	color: orange;
}

.bottom {
	z-index: 3;
	background-color: whitesmoke;
	font-size: small;
	margin-top: 10px;
}
</style>
</head>

<body>
	<div class="box">
		<ga style=" font-size: small; color: deepskyblue;">�ֱ� �Խù�</ga>
		<br>
		<!-- <hr style="border:  0.1px dashed blue;"> -->
		<table style="width: 320px; display: inline-block;">
			<tr style="overflow: hidden;">
				<td><span id="mury">����</span></td>
				<td style="width: 240px;">${vcon.getVideo_name()}
				</td>
			</tr>
			<tr>
				<td><span id="mury" style="background-color: burlywood;">�Խ���</span></td>
				<td>${bcon.getBoard_name()}
				</td>
			</tr>
			<tr>
				<td><span id="mury" style="background-color: slateblue;">����ø</span></td>
				<td>${pcon.getPhoto_name()}</td>
			</tr>
			<tr>
				<td><span id="mury" style="background-color: green;">����</span></td>
				<td>${vicon.getVisitor_name()}</td>
			</tr>

		</table>
		<table
			style="width: 320px; top: -102px; left: 320px; position: relative;">
			<tr>
				<td style="width: 160px;">�Խ���<span id="che">${fn:length(bv) }</span></td>
				<td style="width: 160px;">��ũ�ڽ�<span id="che">${fn:length(mv) }</span></td>
			</tr>
			<tr>
				<td style="width: 160px;">����<span id="che">${fn:length(vv) }</span></td>
				<td style="width: 160px;">����<span id="che">${fn:length(viv) }</span></td>
			</tr>
			<tr>
				<td style="width: 160px;">����ø<span id="che">${fn:length(pv) }</span></td>
				<td style="width: 160px;"></td>
			</tr>
		</table>
		<ga style=" font-size: small; color: deepskyblue;">�̴Ϸ�</ga>
		<br> <img style="height: 320px;"
			src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/���λ�.jpg">
		<br>
		<ga style=" font-size: small; color: brown;">
		<div style="text-align: center; background-color: antiquewhite;"
			id="div">HTML�� ������Ʈ 1�� ������ ����� �载�� �Ž¿� �̿���</div>
		<div class="bottom">
			<span>comment</span><input type="text" size="70px" class="te"
				id="tex"> <input type="submit" onclick="cha()" value="Ȯ��">

		</div>
		</ga>
		<br>


	</div>
	</div>

	<script>
		function cha() {
			var div = document.getElementById("div");
			var text = document.getElementById("tex");
			div.innerHTML = text.value;
		}

		setInterval(function() {
			var div = document.getElementById("div");
			var a = div.innerHTML;
			div.innerHTML = a.substring(1, a.length) + a.substring(0, 1);
		}, 300)
	</script>

</body>

</html>