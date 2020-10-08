<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<h2>로그인 처리</h2>
<%
String name=(String)session.getAttribute("name");
String pass=(String)session.getAttribute("pass");
if(name==null){
	response.sendRedirect("LoginForm.jsp");
}

%>
<%=name%>님 안녕하세요.

<%
session.invalidate();
//세션 무효화

%>
</body>
</html>