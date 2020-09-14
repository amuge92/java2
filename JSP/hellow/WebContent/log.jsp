<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	<%
		String id = request.getParameter("id");
	String pa = request.getParameter("pa");
	String pa2 = request.getParameter("pa2");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");

	String[] ch = request.getParameterValues("ch");//관심

	String sel = request.getParameter("sel");
	String rad = request.getParameter("rad");
	String textarea = request.getParameter("textarea");
	out.print(id + "<br>" + pa + "<br>" + pa2 + "<br>" + email + "<br>" + tel + "<br>" + ch[0] + "<br>" + sel + "<br>" + rad
			+ "<br>" + textarea);
	%>


</body>
</html>