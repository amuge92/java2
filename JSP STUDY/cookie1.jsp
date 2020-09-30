<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<%
Cookie co = new Cookie("id","pink");
co.setMaxAge(365*24*60*60);
response.addCookie(co);
response.addCookie(new Cookie("pw","1234"));
response.addCookie(new Cookie("age","24"));
%>
<h1>ÄíÅ° ¼³Á¤</h1>
</body>
</html>