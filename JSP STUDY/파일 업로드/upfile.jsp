<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<form action="upload.jsp" method="post" enctype="multipart/form-data">
1.颇老 : <input type="file" name="up01"><br>
2.颇老 : <input type="file" name="up02"><br>
3.颇老 : <input type="file" name="up03"><br>
<input type="submit" value="傈价">
	</form>
</body>
</html>