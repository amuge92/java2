<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h2>회원삭제</h2>
		<table width="300" border="1">
			<form action="MemberDeleteProc.jsp">
				<%
					String id = request.getParameter("id");
				%>
				<tr height="50">
					<td align="center" width="150">아이디</td>
					<td align="center" width="250"><%=id%></td>
				<tr>
				<tr>
					<td align="center" width="150">비밀번호</td>
					<td align="center" width="250"><input type="password"
						name="pass"></td>
				<tr>
				<tr>
					<td align="center" width="150" colspan="2"><input type="hidden" name="id" value="<%=id%>">
						<input type="submit" value="회원삭제"> <input type="button"
						onclick="location.href='MemberList.jsp'" value="전체 회원"></td>
				</tr>
			</form>

		</table>
	</center>


</body>
</html>