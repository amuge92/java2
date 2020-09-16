<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

	<%
		request.setCharacterEncoding("EUC-KR");
	String food = request.getParameter("food");
	String[] mu = request.getParameterValues("mu");
	out.print(food + "<br>");
	for (String mu1 : mu) {
		out.print(mu1 + "<br>");
	}
	%>

</body>
</html>