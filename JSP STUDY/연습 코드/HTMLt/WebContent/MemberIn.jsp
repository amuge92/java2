<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page import="model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
	MemberDAO md = new MemberDAO();
	Memberbean mbean = md.oneMember(id);
	%>
	<center>
		<h1>ȸ�� ����</h1>
		<table width="800" border="1">
			<tr height="50">
				<td align="center" width="350">���̵�</td>
				<td align="center" width="250">�̸���</td>
				<td align="center" width="200">��ȭ��ȣ</td>
				<td align="center" width="200">���</td>
				<td align="center" width="200">����</td>
				<td align="center" width="200">����</td>
				<td align="center" width="200">�ϰ���� ��</td>


			</tr>
			<tr height="50">
				<td align="center" width="350"><%=mbean.getId()%></a></td>
				<td align="center" width="250"><%=mbean.getEmail()%></td>
				<td align="center" width="200"><%=mbean.getTel()%></td>
				<td align="center" width="200"><%=mbean.getHobby()%></td>
				<td align="center" width="200"><%=mbean.getJob()%></td>
				<td align="center" width="200"><%=mbean.getAge()%></td>
				<td align="center" width="200"><%=mbean.getIntro()%></td>
			</tr>
			<tr height="50">
				<td colspan="7" align="center" width="150">
					<button
						onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">ȸ������
						����</button>
					<button
						onclick="location.href='MemberDelete.jsp?id=<%=mbean.getId()%>'">ȸ��
						����</button>
					<button onclick="location.href='MemberList.jsp'">��� ����</button>
					<button onclick="location.href='MemberJoin.jsp'">ȸ�� ����</button>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>