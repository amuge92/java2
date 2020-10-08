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
		<h1>회원 정보</h1>
		<table width="800" border="1">
			<tr height="50">
				<td align="center" width="350">아이디</td>
				<td align="center" width="250">이메일</td>
				<td align="center" width="200">전화번호</td>
				<td align="center" width="200">취미</td>
				<td align="center" width="200">직업</td>
				<td align="center" width="200">나이</td>
				<td align="center" width="200">하고싶은 말</td>


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
						onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">회원정보
						수정</button>
					<button
						onclick="location.href='MemberDelete.jsp?id=<%=mbean.getId()%>'">회원
						삭제</button>
					<button onclick="location.href='MemberList.jsp'">목록 보기</button>
					<button onclick="location.href='MemberJoin.jsp'">회원 가입</button>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>