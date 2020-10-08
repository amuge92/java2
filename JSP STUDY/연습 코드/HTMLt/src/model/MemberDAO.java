package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	Memberbean mbean;
	public void getCon() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		try {
			//외부(server.xml)에서 데이터 읽어들여야함
			Context initctx = new InitialContext();
			//톰갯 서버에 정보를 담아놓은 곳으로 이동시킨다.
			Context envctx = (Context) initctx.lookup("java:comp/env");
			//데이터 소스 객체 선언
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			//데이터 소스를 기준으로 연결
			con=ds.getConnection();
			
//			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
//			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.8:1521/xepdb1", "Sys as sysdba",
//					"Tareina!978");
		} catch (Exception ex) {
			System.out.println(ex);
		}

	};


	public void insertMember(Memberbean mbean) throws SQLException {
		try {
			getCon();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into Mem values(?,?,?,?,?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1,mbean.getId());
		ps.setString(2,mbean.getPass0());
		ps.setString(3,mbean.getEmail());
		ps.setString(4,mbean.getTel());
		ps.setString(5,mbean.getHobby());
		ps.setString(6,mbean.getJob());
		ps.setString(7,mbean.getAge());
		ps.setString(8,mbean.getIntro());
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public Vector<Memberbean> allMember() throws SQLException{
		try {
			getCon();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector<Memberbean> v = new Vector<Memberbean>();
		String sql = "select * from Mem";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
		mbean = new Memberbean();
		mbean.setId(rs.getString(1));
		mbean.setPass0(rs.getString(2));
		mbean.setEmail(rs.getString(3));
		mbean.setTel(rs.getString(4));
		mbean.setHobby(rs.getString(5));
		mbean.setJob(rs.getString(6));
		mbean.setAge(rs.getString(7));
		mbean.setIntro(rs.getString(8));
		v.add(mbean);
		}
		rs.close();
		ps.close();
		
		return v;
	}
	
	public Memberbean oneMember(String id) throws SQLException {
		try {
			getCon();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Memberbean mbean = new Memberbean();
		String sql = "select * from Mem where id=?";
//		+"'"+id+"'";
		ps=con.prepareStatement(sql);
		ps.setString(1, id);
		rs=ps.executeQuery();
		if(rs.next()) {
		mbean.setId(rs.getString(1));
		mbean.setPass0(rs.getString(2));
		mbean.setEmail(rs.getString(3));
		mbean.setTel(rs.getString(4));
		mbean.setHobby(rs.getString(5));
		mbean.setJob(rs.getString(6));
		mbean.setAge(rs.getString(7));
		mbean.setIntro(rs.getString(8));
		}
		return mbean;
	};
	
	public String getPass(String id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		String pass="";
		getCon();
		String sql="select pass0 from mem where id=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, id);
		rs=ps.executeQuery();
		if(rs.next()) {
			pass = rs.getString(1);
		}
		rs.close();
		ps.close();
		con.close();
		return pass; 
	}
	public void update(Memberbean mbean) throws Exception, IllegalAccessException, ClassNotFoundException{
	getCon();
	String sql = "update mem set mem.email=?, mem.tel=? where id=?";
	ps=con.prepareStatement(sql);
	ps.setString(1, mbean.getEmail());
	ps.setString(2, mbean.getTel());
	ps.setString(3, mbean.getId());
	ps.executeUpdate();
	con.close();
	}
	
	public void delete(String id) throws Exception, IllegalAccessException, ClassNotFoundException {
		getCon();
		String sql="delete mem where id=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, id);
		ps.executeUpdate();
	}
}
