<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
	<%
		String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pw");
	%>
	<%=id%>
	<%=pw%>
	<h3>세션 값 얻기</h3>
	<%
		Enumeration name = session.getAttributeNames();
	while (name.hasMoreElements()) {
		String n = name.nextElement().toString();
		String value = (String) session.getAttribute(n).toString();
		out.print(value);
	}
	%>

</body>
</html>