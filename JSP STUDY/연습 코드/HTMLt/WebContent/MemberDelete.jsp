<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h2>ȸ������</h2>
		<table width="300" border="1">
			<form action="MemberDeleteProc.jsp">
				<%
					String id = request.getParameter("id");
				%>
				<tr height="50">
					<td align="center" width="150">���̵�</td>
					<td align="center" width="250"><%=id%></td>
				<tr>
				<tr>
					<td align="center" width="150">��й�ȣ</td>
					<td align="center" width="250"><input type="password"
						name="pass"></td>
				<tr>
				<tr>
					<td align="center" width="150" colspan="2"><input type="hidden" name="id" value="<%=id%>">
						<input type="submit" value="ȸ������"> <input type="button"
						onclick="location.href='MemberList.jsp'" value="��ü ȸ��"></td>
				</tr>
			</form>

		</table>
	</center>


</body>
</html>