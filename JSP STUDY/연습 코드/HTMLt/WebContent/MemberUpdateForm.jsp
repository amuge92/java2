<%@page import="model.Memberbean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	MemberDAO md = new MemberDAO();
	Memberbean mbean = md.oneMember(id);
	%>

	<h1>ȸ�� ���� ����</h1>
	<center>
	<table width="500" border="1">
		<form action="MemberUpdateProc.jsp" method="get">
			<tr height="50">
				<td align="center" width="100">���̵�</td>
				<td align="center" width="100">�̸���</td>
				<td align="center" width="150">��ȭ��ȣ</td>
				<td align="center" width="150">��й�ȣ</td>
			</tr>
			<tr height="50">
				<td align="center" width="100"><%=mbean.getId()%></td>
				<td align="center" width="100"><input type="email" name="email"
					value="<%=mbean.getEmail()%>"></td>
				<td align="center" width="150"><input type="tel" name="tel"
					value="<%=mbean.getTel()%>"></td>
				<td align="center" width="150"><input type="password"
					name="pass0" placeholder="��й�ȣ Ȯ��"></td>
			</tr>
			<tr height="50">
				<td align="center" colspan="4"><input type="submit"
					value="ȸ������"> <input type="button"
					onclick="location.href='MemberList.jsp'" value="��ü ȸ��"></td>
			</tr>
			<input type="hidden" name="id" value="<%=mbean.getId()%>">
		</form>
	</table>
	</center>

</body>
</html>