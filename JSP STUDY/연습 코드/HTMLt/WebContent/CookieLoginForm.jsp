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
		//����� ��ǻ���� ��Ű ����ҷ� ���� ��Ű���� �о���� 
	//���� ����� �𸣱� ������ �迭�� ����Ͽ� ��Ű���� ������ ���̴�.
	Cookie[] co = request.getCookies();
	String id = "";
	//��Ű���� ���� ���� �ֱ⿡ nulló�� ����.
	if (co != null) {
		for (int i = 0; i < co.length; i++) {
			if (co[i].getName().equals("id")) {
		id = co[i].getValue();
		break;
			}
			//���ϴ� �����͸� ã�ұ⿡ �ݸ� ��������
		}
	}
	%>

	<form name="form" action="CookieLoginProc.jsp" method="post">
		<center>
			<h1>��Ű</h1>
			<table border="1" width="500">
				<tr>
					<td>���̵�</td>
					<td><input name="id" value="<%=id%>"></td>
				</tr>
				<tr>
					<td>�н�����</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="checkbox" name="save">���̵�
						����</td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="�α���"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>