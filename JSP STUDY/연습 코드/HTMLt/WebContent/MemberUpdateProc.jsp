<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%
request.setCharacterEncoding("euc-kr");
MemberDAO md = new MemberDAO();
%>
<jsp:useBean id="mbean" class="model.Memberbean">
<jsp:setProperty property="*" name="mbean"/></jsp:useBean>
<%
String id  = request.getParameter("id");
String pass = md.getPass(id);
if(pass.equals(request.getParameter("pass0"))){
	md.update(mbean);
	response.sendRedirect("MemberList.jsp");
}else{
	%>
	<script type="text/javascript">
	alert("패스워드 확인");
	history.go(-1);
	</script>
	<%
}

%>

</body>
</html>