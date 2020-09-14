<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
	
</script>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	<%
		int a = Integer.parseInt(request.getParameter("text"));

	for (int i = 2; i <= 9; i++) {
		out.print(a + " X " + i + " = " + a * i + "<br>");
	}
	%>


</body>
</html>