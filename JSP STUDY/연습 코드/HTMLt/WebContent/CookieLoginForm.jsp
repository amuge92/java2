<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style>
td {
	padding: 10px
}
</style>
</head>
<body>
	<%
		//사용자 컴퓨터의 쿠키 저장소로 부터 쿠키값을 읽어들임 
	//값이 몇개인지 모르기 때문에 배열을 사용하여 쿠키값을 저장할 것이다.
	Cookie[] co = request.getCookies();
	String id = "";
	//쿠키값이 없을 수도 있기에 null처리 해줌.
	if (co != null) {
		for (int i = 0; i < co.length; i++) {
			if (co[i].getName().equals("id")) {
		id = co[i].getValue();
		break;
			}
			//원하는 데이터를 찾았기에 반목문 빠져나옴
		}
	}
	%>

	<form name="form" action="CookieLoginProc.jsp" method="post">
		<center>
			<h1>쿠키</h1>
			<table border="1" width="500">
				<tr>
					<td>아이디</td>
					<td><input name="id" value="<%=id%>"></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="checkbox" name="save">아이디
						저장</td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="로그인"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>