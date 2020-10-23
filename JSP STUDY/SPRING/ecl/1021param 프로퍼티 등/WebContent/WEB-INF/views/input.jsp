<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body leftmargin="0" topmargin="0">
	<!-- 
	<form:form action="in" method="post" modelAttribute="data1">
s1:<form:input path="s1" type="text" />
		<br>
		<form:errors path="s1" />
		<br>

s2:<form:input path="s2" type="text" />
		<br>
		<form:errors path="s2" />
		<br>
		<form:button type="submit">제출</form:button>
	</form:form> -->


	<form method="post" action="in">
		아이디 : <input name="s1" placeholder="2~10자 사이의 문자"><br>
		<spring:hasBindErrors name="data1">

			<span style="color: red; font-size: smaill"> 
			<c:if test="${errors.hasFieldErrors('s1') }">
               ${errors.getFieldError('s1').defaultMessage}
            <spring:message code="${errors.getFieldError('s1').codes[0] }"></spring:message>
			<spring:message code="${errors.getFieldError('s1').codes[0] }"></spring:message>
				</c:if>
			</span>
		</spring:hasBindErrors>
		<br> 비밀번호 : <input name="s2" placeholder="100이하의 숫자"><br>
		<br> <br>
		<spring:hasBindErrors name="data1">
			<c:if test="${errors.hasFieldErrors('s2') }">

				<span style="color: red; font-size: smaill">
					${errors.getFieldError('s2').defaultMessage} </span>

			</c:if>
		</spring:hasBindErrors>
		<br> <input type="submit" value="제출">
	</form>

</body>
</html>