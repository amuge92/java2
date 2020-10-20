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

import lee.bean.cy_musicbean;
import lee.bean.cy_photobean;


public class cy_photoDAO implements cy_DAO{
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	cy_photobean photo;
	public void getCon() throws Exception {
		Context initctx = new InitialContext();
		//톰갯 서버에 정보를 담아놓은 곳으로 이동시킨다.
		Context envctx = (Context) initctx.lookup("java:comp/env");
		//데이터 소스 객체 선언
		DataSource ds = (DataSource) envctx.lookup("jdbc/poolcy");
		//데이터 소스를 기준으로 연결
		
		
		con=ds.getConnection();
	}
	public Object OneContets(int vNum) throws Exception {
		photo  =new cy_photobean();
		getCon();
		String sql = "select * from cy_photo where vNum = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, vNum);
		rs=ps.executeQuery();
		if(rs.next()) {
			photo.setPhoto_name(rs.getString(1));
			photo.setPhoto_writer(rs.getString(2));
			photo.setPhoto_date(rs.getString(3));
			photo.setPhoto_src(rs.getString(4));
			photo.setPhoto_comment(rs.getString(5));
			photo.setPhoto_folder(rs.getInt(6));
			photo.setPhoto_cnt(rs.getInt(7));
			photo.setvNum(rs.getInt(8));
		}rs.close();
		ps.close();
		con.close();
		return photo;
	}

	public Vector<cy_photobean> AllContents() {
		Vector<cy_photobean> v = new Vector<cy_photobean>();
		try {
			getCon();
		
		String sql = "select * from cy_photo";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			photo = new cy_photobean();
			photo.setPhoto_name(rs.getString(1));
			photo.setPhoto_writer(rs.getString(2));
			photo.setPhoto_date(rs.getString(3));
			photo.setPhoto_src(rs.getString(4));
			photo.setPhoto_comment(rs.getString(5));
			photo.setPhoto_folder(rs.getInt(6));
			photo.setPhoto_cnt(rs.getInt(7));
			photo.setvNum(rs.getInt(8));
			v.add(photo);
		}rs.close();
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
		String sql="UPDATE cy_photo SET  photo_cnt=photo_cnt+1 where vNum="+"'"+vNum+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
		rs.close();
		ps.close();
		con.close();
	}
	public void insertContents(Object obj) {
		try {
			getCon();
			photo = (cy_photobean) obj;
			String sql = "insert into cy_visitor values(?,?,?,?,?,?,?,photose.nextval)";
			ps = con.prepareStatement(sql);
			ps.setString(1, photo.getPhoto_name());
			ps.setString(2, photo.getPhoto_writer());
			ps.setString(3, photo.getPhoto_date());
			ps.setString(4, photo.getPhoto_src());
			ps.setString(5, photo.getPhoto_comment());
			ps.setInt(6, photo.getPhoto_folder());
			ps.setInt(7, photo.getPhoto_cnt());
			ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
}
