<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.Base64.Decoder"%>
<%@page import="java.awt.print.Printable"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>R1�����ٶ󸶹ٻ�</h1>
<%
Cookie[] c =  request.getCookies();
for(Cookie cc :c ){
	String str = URLDecoder.decode(cc.getValue(),"UTF-8");
	
	out.print("��Ű��Ű");
	
	out.print(str);
}
%>




</body>
</html>