<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>���̿���>�α����� �ʿ��մϴ� :)</title>
<style>
body {
	text-align: center;
	background-color: whitesmoke;
	color: black;
}

#logo {
	position: absolute;
	top: 10px;
	left: 10px;
}

.bg {
	margin-top: 10px;
	font-weight: normal;
	background-color: white;
	width: 380px;
	height: 150px;
}

#log {
	position: absolute;
	width: 50px;
	height: 47px;
	top: 60px;
	left: 244px;
	border: 2px solid yellow;
	border-radius: 5px;
	background-color: orange;
	font-size: small;
	color: white;
	font-weight: bold;
}

#id {
	width: 130px;
	position: absolute;
	left: 103px;
}

#e {
	font-size: x-small;
	text-decoration: none;
	padding-left: 90px;
}

#h {
	font-size: x-small;
	text-decoration: none;
	padding-right: 90px;
}
</style>
<b id="logo">���̿��� �α���</b>
<br>
</head>
<body onload="window.resizeTo(400,280)">
	<form action="">
		<div class="bg">
			<br> <input type="button" value="�α���" id="log" onclick="on()">
			<input type="text" placeholder="���̵�" id="id" name="id"><br>
			<input type="password" placeholder="��й�ȣ" id="pw" name="pw"><br>
			<small> <input type="checkbox">�̸������� <input
				type="checkbox">��������
			</small>
			<hr width="200px">
			<a id="e" href="#" style="float: left;">�̸��� / ��й�ȣ ã�� </a> <a id="h"
				href="#" style="float: right;">ȸ�������ϱ� </a>

		</div>
	</form>
	<br>
	<script>
		function on() {
			var id = document.getElementById("id").value;
			opener.location.href = "Mainservlet?command=cy_MainForm.jsp&id="+ id;
			window.close();
		}
	</script>
</body>

</html>