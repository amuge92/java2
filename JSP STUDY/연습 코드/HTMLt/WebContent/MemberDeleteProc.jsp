<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<%
String id = request.getParameter("id");
String pass = request.getParameter("pass");
MemberDAO md = new MemberDAO();
String pass0 = md.getPass(id);
if(pass.equals(pass0)){
	md.delete(id);
	response.sendRedirect("MemberList.jsp");
}else{
	%>
	<script type="text/javascript">
	alert("비번 확인")
	history.go(-1);
	</script>
	<%
}


%>


</body>
</html>