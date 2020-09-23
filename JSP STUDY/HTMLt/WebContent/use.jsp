<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.*,bean.*,java.sql.*" %>
    
    <%Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pt=null;
    ResultSet rs = null;
    String id ="",pwd = "",name = "",email="",adr="",job="";
    int cnt=0;
    try{
    	con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.31:1521/xepdb1", "Sys as sysdba",
				"Tareina!978");
    	//stmt=con.createStatement();
    	pt = con.prepareStatement("select * from tbl");
    	rs=pt.executeQuery();
    	
    
    %>
<!DOCTYPE html>
<html>
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
while(rs.next()){
id = rs.getString(1);
pwd = rs.getString(2);
name = rs.getString(3);
email = rs.getString(4);
adr = rs.getString(5);
job = rs.getString(6);
%>


<tr>
<td><%=id %></td>
<td><%=pwd %></td>
<td><%=name %></td>
<td><%=email %></td>
<td><%=adr %></td>
<td><%=job %></td></tr>
<%
}

}catch(SQLException e){
	System.out.println("SQLexception");
}catch(Exception ex){
	System.out.println("exception");
}
		rs.close();
		pt.close();
		con.close();
	
%>
</table>
</body>
</html>