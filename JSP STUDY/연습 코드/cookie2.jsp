<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<%
Cookie []co = request.getCookies();
for(Cookie c : co){
	out.print(c.getName()+":"+c.getValue());
}

%>


</body>
</html>