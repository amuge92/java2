<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import= "java.util.*,model.*" %>
<jsp:useBean id="reg" class="model.RegisterM"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<table border="1" bordercolor="red">
<tr>
<td>id</td>
<td>pwd</td>
<td>name</td>
<td>email</td>
<td>adr</td>
<td>job</td></tr>
<%
Vector<RegisterBean> v =  reg.getRegi();

for(int i =0;i<v.size();i++){
RegisterBean r = v.get(i);

%>
<tr>
<td><%=r.getId() %></td>
<td><%=r.getPwd() %></td>
<td><%=r.getName() %></td>
<td><%=r.getEmail() %></td>
<td><%=r.getAdr()%></td>
<td><%=r.getJob()%></td>
</tr>
<%
}
%>



</table>

</body>
</html>