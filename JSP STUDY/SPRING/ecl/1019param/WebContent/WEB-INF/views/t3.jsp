<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>t2t2</h2>
<form:form modelAttribute="d1" action="r">

아이디 : <form:input path="id"/>

<!-- path: id,name속성으로 지정된다. model값 추출해서 value에 저장 -->
이름 : <form:input path="name"/>
비번 : <form:input path="pw"/>


</form:form>
</body>
</html>