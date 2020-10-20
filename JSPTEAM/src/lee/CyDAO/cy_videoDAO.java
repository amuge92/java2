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

import lee.bean.cy_photobean;
import lee.bean.cy_videobean;


public class cy_videoDAO implements cy_DAO{
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	cy_videobean video;
	public void getCon() throws Exception {
		Context initctx = new InitialContext();
		//톰갯 서버에 정보를 담아놓은 곳으로 이동시킨다.
		Context envctx = (Context) initctx.lookup("java:comp/env");
		//데이터 소스 객체 선언
		DataSource ds = (DataSource) envctx.lookup("jdbc/poolcy");
		//데이터 소스를 기준으로 연결
		con=ds.getConnection();
	}
	public cy_videobean OneContets(int vNum) throws Exception {
		video  =new cy_videobean();
		getCon();
		String sql = "select * from cy_video where vNum = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, vNum);
		rs=ps.executeQuery();
		if(rs.next()) {
			video.setVideo_name(rs.getString(1));
			video.setVideo_writer(rs.getString(2));
			video.setVideo_date(rs.getString(3));
			video.setVideo_src(rs.getString(4));
			video.setVideo_comment(rs.getString(5));
			video.setVideo_folder(rs.getInt(6));
			video.setVideo_cnt(rs.getInt(7));
			video.setvNum(rs.getInt(8));
		}rs.close();
		ps.close();
		con.close();
		return video;
	}

	public Vector<cy_videobean> AllContents() {
		Vector<cy_videobean> v = new Vector<cy_videobean>();
		try {
			getCon();
		
		String sql = "select * from cy_video";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			video = new cy_videobean();
			video.setVideo_name(rs.getString(1));
			video.setVideo_writer(rs.getString(2));
			video.setVideo_date(rs.getString(3));
			video.setVideo_src(rs.getString(4));
			video.setVideo_comment(rs.getString(5));
			video.setVideo_folder(rs.getInt(6));
			video.setVideo_cnt(rs.getInt(7));
			video.setvNum(rs.getInt(8));
			v.add(video);
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
		String sql="UPDATE cy_video SET  Video_cnt=Video_cnt+1 where vNum="+"'"+vNum+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
		rs.close();
		ps.close();
		con.close();
	}
	public void insertContents(Object obj) {
		try {
			getCon();
			video = (cy_videobean) obj;
			String sql = "insert into cy_visitor values(?,?,?,?,?,?,?,vnumse.nextval)";
			ps = con.prepareStatement(sql);
			ps.setString(1, video.getVideo_name());
			ps.setString(2, video.getVideo_writer());
			ps.setString(3, video.getVideo_date());
			ps.setString(4, video.getVideo_src());
			ps.setString(5, video.getVideo_comment());
			ps.setInt(6, video.getVideo_folder());
			ps.setInt(7, video.getVideo_cnt());
			ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
