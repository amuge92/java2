<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*,model.*,java.sql.*" %>

<!DOCTYPE html>
<html>
<body>
<%request.setCharacterEncoding("euc-kr"); 
String hobby[] = request.getParameterValues("hobby");
String txt="";
for(int i = 0 ; i <hobby.length;i++){
	txt+=hobby[i];
}
%>
<jsp:useBean id="mbean" class="model.Memberbean">
<jsp:setProperty property="*" name="mbean"/>
</jsp:useBean>

<% mbean.setHobby(txt);

MemberDAO md = new MemberDAO();
md.insertMember(mbean);
response.sendRedirect("MemberList.jsp");
//회원가입 완료되면 회원정보 보여주는 페이지로. 
%>
</body>
</html>

