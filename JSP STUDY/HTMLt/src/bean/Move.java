package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Move {
	public static void main(String[] args) {
		Connection con;
       
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con = DriverManager.getConnection("j"
					+ "dbc:oracle:thin:@192.168.1.31:1521/xepdb1", "Sys as sysdba",
					"Tareina!978");
			System.out.println("¼º°ø");
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}