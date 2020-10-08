<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<!DOCTYPE html>
<html>
<body>
	<form action="param" method="get">
		아이디 : <input required="required" name="id"><br> 나이 : <input
			required="required" name="age"id="age"><br> <input type="submit"
			value="제출" onclick="return on()">
	</form>

	<script type="text/javascript" src="dd.js">
	</script>
</body>
</html>