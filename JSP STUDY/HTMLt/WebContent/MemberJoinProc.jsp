<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*,model.*,java.sql.*" %>
<%
Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
Connection con=null;
%>
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
   try{
       con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.31:1521/xepdb1", "Sys as sysdba",
		"Tareina!978");

       String sql = "insert into Mem values(?,?,?,?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(1, mbean.getId());
       ps.setString(2, mbean.getPass0());
       ps.setString(3, mbean.getEmail());
       ps.setString(4, mbean.getTel());
       ps.setString(5, mbean.getHobby());
       ps.setString(6, mbean.getJob());
       ps.setString(7, mbean.getAge());
       ps.setString(8, mbean.getIntro());
       ps.executeUpdate();
       ps.close();
   }catch(SQLException ex){
	   out.print(ex);
	   
   }catch(Exception e){
	   out.print(e);
   }
   con.close();
%>




</body>
</html>