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

���̵� : <form:input path="id"/>

<!-- path: id,name�Ӽ����� �����ȴ�. model�� �����ؼ� value�� ���� -->
�̸� : <form:input path="name"/>
��� : <form:input path="pw"/>


</form:form>
</body>
</html>