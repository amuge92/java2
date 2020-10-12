<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");

	String fol = "";
	String save = "/load";
	String encType = "UTF-8";
	//한글 설정
	int maxSize = 10 * 1024 * 1024;//파일 사이즈 5MB정도.

	//서버상의 경로를 알아냄
	ServletContext con = getServletContext();
	fol = con.getRealPath(save);
	System.out.println(fol);

	try {
		MultipartRequest m = new MultipartRequest(request, fol, maxSize, encType, new DefaultFileRenamePolicy());
	%><%=m.getParameter("name")%>
	<%
		out.print(fol);
	} catch (Exception e) {
	e.printStackTrace();
	}%>


</body>
</html>