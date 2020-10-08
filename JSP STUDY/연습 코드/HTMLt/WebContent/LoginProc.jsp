<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<%
		String id = "pink";
	String pw = "1234";
	String name = "shin";
	String id1 = request.getParameter("id");
	String pw1 = request.getParameter("pw");
	if (id.equals(id1) && pw.equals(pw1)) {
		session.setAttribute("name", name);
		response.sendRedirect("LoginProc2.jsp");
	} else {
	%>
	<script type="text/javascript">
		history.go(-1)
	</script>
	<%
		}
	%>




</body>
</html>