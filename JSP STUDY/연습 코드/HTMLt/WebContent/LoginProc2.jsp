<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<h2>�α��� ó��</h2>
<%
String name=(String)session.getAttribute("name");
String pass=(String)session.getAttribute("pass");
if(name==null){
	response.sendRedirect("LoginForm.jsp");
}

%>
<%=name%>�� �ȳ��ϼ���.

<%
session.invalidate();
//���� ��ȿȭ

%>
</body>
</html>