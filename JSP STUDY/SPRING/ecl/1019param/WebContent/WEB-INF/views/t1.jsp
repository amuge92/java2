<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>t1t1</h2>

${param.su1 }
${param.su2 }

${requestScope.su1 }
${requestScope.su2 }


${requestScope.data1.name }
${requestScope.bean.id }

<!-- 
<form action="r">
이름 : <input name="name" value="${requestScope.data1.name }">
아이디 : <input name="id" value="${requestScope.data1.id }">
비번 : <input name="pw" value="${requestScope.data1.pw }">
<input type="submit" value="제출">
</form>
-->

</body>
</html>