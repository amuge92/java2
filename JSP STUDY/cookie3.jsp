<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<%

Cookie c = new Cookie("id","");
c.setMaxAge(0);
//��Ű����
response.addCookie(c);
%>

</body>
</html>