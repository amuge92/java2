package lee.CyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import lee.bean.cy_visitorbean;

public class cy_visitorDAO  {
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	cy_visitorbean visitor;

	public void getCon() throws Exception {
		Context initctx = new InitialContext();
		// 톰갯 서버에 정보를 담아놓은 곳으로 이동시킨다.
		Context envctx = (Context) initctx.lookup("java:comp/env");
		// 데이터 소스 객체 선언
		DataSource ds = (DataSource) envctx.lookup("jdbc/poolcy");
		// 데이터 소스를 기준으로 연결
		con = ds.getConnection();
	}

	public Object OneContets(int vNum) throws Exception {
		visitor = new cy_visitorbean();
		getCon();
		String sql = "select * from cy_visitor where vNum = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, vNum);
		rs = ps.executeQuery();
		if (rs.next()) {
			visitor.setVisitor_name(rs.getString(1));
			visitor.setVisitor_writer(rs.getString(2));
			visitor.setVisitor_date(rs.getString(3));
			visitor.setVisitor_src(rs.getString(4));
			visitor.setVisitor_comment(rs.getString(5));
			visitor.setVisitor_folder(rs.getInt(6));
			visitor.setVisitor_cnt(rs.getInt(7));
			visitor.setvNum(rs.getInt(8));
		}
		rs.close();
		ps.close();
		con.close();
		return visitor;
	}

	public Vector<cy_visitorbean> AllContents() {
		Vector<cy_visitorbean> v = new Vector<cy_visitorbean>();
		try {
			getCon();

			String sql = "select * from cy_visitor";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				visitor = new cy_visitorbean();
				visitor.setVisitor_name(rs.getString(1));
				visitor.setVisitor_writer(rs.getString(2));
				visitor.setVisitor_date(rs.getString(3));
				visitor.setVisitor_src(rs.getString(4));
				visitor.setVisitor_comment(rs.getString(5));
				visitor.setVisitor_folder(rs.getInt(6));
				visitor.setVisitor_cnt(rs.getInt(7));
				visitor.setvNum(rs.getInt(8));
				v.add(visitor);
			}
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

	public void updateCount(int vNum) throws Exception {
		getCon();
		String sql = "UPDATE cy_visitor SET  visitor_cnt=visitor_cnt+1 where vNum=" + "'" + vNum + "'";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		rs.close();
		ps.close();
		con.close();
	}
	
	public void insertContents2(cy_visitorbean obj) {
		try {
			getCon();
			visitor = obj;
			String sql = "insert into cy_visitor values(?,?,?,?,?,?,?,visitorse.nextval)";
			ps = con.prepareStatement(sql);
			ps.setString(1, " ");
			ps.setString(2, visitor.getVisitor_writer());
			ps.setString(3, visitor.getVisitor_date());
			ps.setString(4, " ");
			ps.setString(5, visitor.getVisitor_comment());
			ps.setInt(6, 0);
			ps.setInt(7, 0);
			ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
