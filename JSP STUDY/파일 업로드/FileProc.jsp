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
	//�ѱ� ����
	int maxSize = 10 * 1024 * 1024;//���� ������ 5MB����.

	//�������� ��θ� �˾Ƴ�
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