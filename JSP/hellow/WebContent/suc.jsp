<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<body>
<%
request.setCharacterEncoding("euc-kr");
String id = request.getParameter("id");
String pw = request.getParameter("pw");

%>
<%=id%>
<%=pw %>
</body>
</html>