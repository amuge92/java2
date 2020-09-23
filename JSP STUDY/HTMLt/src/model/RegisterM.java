package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class RegisterM {
private final String JDBC_DRIVER=
"oracle.jdbc.driver.OracleDriver";
private final String JDBC_URL="jdbc:oracle:thin:@192.168.1.31:1521/xepdb1";
private final String USER="Sys as sysdba";
private final String PASS = "Tareina!978";
public RegisterM() {
	try {
		Class.forName(JDBC_DRIVER);
	}catch(Exception e) {
		
	}
}
public Vector<RegisterBean> getRegi() throws SQLException{
	Connection con=null;
	Statement stmt =null;
	ResultSet rs = null;
	Vector<RegisterBean> v = new Vector<RegisterBean>();
	try {
		con=DriverManager.getConnection(JDBC_URL, USER, PASS);
	String query = "select * from tbl";
	stmt=con.createStatement();
	rs= stmt.executeQuery(query);
	while(rs.next()) {
		RegisterBean bean = new RegisterBean();
	bean.setId(rs.getString(1));
	bean.setPwd(rs.getString(2));
	bean.setName(rs.getString(3));
	bean.setEmail(rs.getString(4));
	bean.setAdr(rs.getString(5));
	bean.setJob(rs.getString(6));
	v.addElement(bean);
	}
	} catch (Exception e) {
		System.out.println("¹¹¾ß");
	}
	rs.close();
	stmt.close();
	con.close();
	
	return v;
}





}
