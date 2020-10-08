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

	<h1>회원 정보 수정</h1>
	<center>
	<table width="500" border="1">
		<form action="MemberUpdateProc.jsp" method="get">
			<tr height="50">
				<td align="center" width="100">아이디</td>
				<td align="center" width="100">이메일</td>
				<td align="center" width="150">전화번호</td>
				<td align="center" width="150">비밀번호</td>
			</tr>
			<tr height="50">
				<td align="center" width="100"><%=mbean.getId()%></td>
				<td align="center" width="100"><input type="email" name="email"
					value="<%=mbean.getEmail()%>"></td>
				<td align="center" width="150"><input type="tel" name="tel"
					value="<%=mbean.getTel()%>"></td>
				<td align="center" width="150"><input type="password"
					name="pass0" placeholder="비밀번호 확인"></td>
			</tr>
			<tr height="50">
				<td align="center" colspan="4"><input type="submit"
					value="회원수정"> <input type="button"
					onclick="location.href='MemberList.jsp'" value="전체 회원"></td>
			</tr>
			<input type="hidden" name="id" value="<%=mbean.getId()%>">
		</form>
	</table>
	</center>

</body>
</html>