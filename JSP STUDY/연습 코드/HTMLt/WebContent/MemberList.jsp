<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page import="java.util.*,model.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
		MemberDAO md = new MemberDAO();
	Vector<Memberbean> v = md.allMember();
	%>
	<center>
		<table width="800" border="1">
			<tr height="50">
				<td align="center" width="150">���̵�</td>
				<td align="center" width="250">�̸���</td>
				<td align="center" width="200">��ȭ��ȣ</td>
				<td align="center" width="200">���</td>
			</tr>
			<%
				for (int i = 0; i < v.size(); i++) {
				Memberbean mbean = v.get(i);
			%>
			<tr height="50">
				<td align="center" width="150"><a
					href="MemberIn.jsp?id=<%=mbean.getId()%>"> <%=mbean.getId()%></a></td>
				<td align="center" width="250"><%=mbean.getEmail()%></td>
				<td align="center" width="200"><%=mbean.getTel()%></td>
				<td align="center" width="200"><%=mbean.getHobby()%></td>
			</tr>

			<%
				}
			%>
		</table>

	</center>


</body>
</html>