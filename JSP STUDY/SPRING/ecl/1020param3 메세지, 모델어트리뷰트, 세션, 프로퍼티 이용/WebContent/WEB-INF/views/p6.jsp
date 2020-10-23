<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>p65</h1>
aa.a1:<spring:message code="aa.a1" /><br>
aa.a2:<spring:message code="aa.a2"/><br>
aa.a3:<spring:message code="aa.a3" arguments="${ary }" /><br>
aa.a4:<spring:message code="aa.a4" /><br>
</body>
</html>