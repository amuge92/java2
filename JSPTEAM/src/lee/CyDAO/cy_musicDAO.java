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

public class cy_musicDAO implements cy_DAO {
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	cy_musicbean music;

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
		music = new cy_musicbean();
		getCon();
		String sql = "select * from cy_music where vNum = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, vNum);
		rs = ps.executeQuery();
		if (rs.next()) {
			music.setMusic_name(rs.getString(1));
			music.setMusic_writer(rs.getString(2));
			music.setMusic_date(rs.getString(3));
			music.setMusic_src(rs.getString(4));
			music.setMusic_comment(rs.getString(5));
			music.setMusic_folder(rs.getInt(6));
			music.setMusic_cnt(rs.getInt(7));
			music.setvNum(rs.getInt(8));
		}
		rs.close();
		ps.close();
		con.close();
		return music;
	}

	public Vector<cy_musicbean> AllContents() {
		Vector<cy_musicbean> v = new Vector<cy_musicbean>();
		try {
			getCon();

			String sql = "select * from cy_music";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				music = new cy_musicbean();
				music.setMusic_name(rs.getString(1));
				music.setMusic_writer(rs.getString(2));
				music.setMusic_date(rs.getString(3));
				music.setMusic_src(rs.getString(4));
				music.setMusic_comment(rs.getString(5));
				music.setMusic_folder(rs.getInt(6));
				music.setMusic_cnt(rs.getInt(7));
				music.setvNum(rs.getInt(8));
				v.add(music);
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
		String sql = "UPDATE cy_music SET  music_cnt=music_cnt+1 where vNum=" + "'" + vNum + "'";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		rs.close();
		ps.close();
		con.close();
	}

	public void insertContents(Object obj) {
		try {
			getCon();
			music = (cy_musicbean) obj;
			String sql = "insert into cy_visitor values(?,?,?,?,?,?,?,musiccnt.nextval)";
			ps = con.prepareStatement(sql);
			ps.setString(1, music.getMusic_name());
			ps.setString(2, music.getMusic_writer());
			ps.setString(3, music.getMusic_date());
			ps.setString(4, music.getMusic_src());
			ps.setString(5, music.getMusic_comment());
			ps.setInt(6, music.getMusic_folder());
			ps.setInt(7, music.getMusic_cnt());
			ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
