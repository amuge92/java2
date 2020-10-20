package lee.CyDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import lee.bean.cy_boardbean;
import lee.bean.cy_visitorbean;

public class cy_boardDAO implements cy_DAO {
	Connection con = null;
	ResultSet rs = null;;
	PreparedStatement ps = null;
	cy_boardbean board;

	public void getCon() throws Exception {

		Context initctx;
		try {
			initctx = new InitialContext();
			// 톰갯 서버에 정보를 담아놓은 곳으로 이동시킨다.
			Context envctx = (Context) initctx.lookup("java:comp/env");
			// 데이터 소스 객체 선언
			DataSource ds = (DataSource) envctx.lookup("jdbc/poolcy");
			// 데이터 소스를 기준으로 연결
			con = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public cy_boardbean OneContets(int vNum) throws Exception {
		board = new cy_boardbean();
		getCon();
		String sql = "select * from cy_board where vNum = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, vNum);
		rs = ps.executeQuery();
		if (rs.next()) {
			board.setBoard_name(rs.getString(1));
			board.setBoard_writer(rs.getString(2));
			board.setBoard_date(rs.getString(3));
			board.setBoard_src(rs.getString(4));
			board.setBoard_comment(rs.getString(5));
			board.setBoard_folder(rs.getInt(6));
			board.setBoard_cnt(rs.getInt(7));
			board.setvNum(rs.getInt(8));
		}
		rs.close();
		ps.close();
		con.close();
		return board;
	}

	public Vector<cy_boardbean> AllContents() {
		Vector<cy_boardbean> v = new Vector<cy_boardbean>();
		try {
			getCon();

			String sql = "select * from cy_board";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				board = new cy_boardbean();
				board.setBoard_name(rs.getString(1));
				board.setBoard_writer(rs.getString(2));
				board.setBoard_date(rs.getString(3));
				board.setBoard_src(rs.getString(4));
				board.setBoard_comment(rs.getString(5));
				board.setBoard_folder(rs.getInt(6));
				board.setBoard_cnt(rs.getInt(7));
				board.setvNum(rs.getInt(8));
				v.add(board);
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
		String sql = "UPDATE cy_board SET  board_cnt=board_cnt+1 where vNum=" + "'" + vNum + "'";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		rs.close();
		ps.close();
		con.close();
	}

	public void insertContents(Object obj) {
		try {
			getCon();
			board = (cy_boardbean) obj;
			String sql = "insert into cy_visitor values(?,?,?,?,?,?,?,boardcnt.nextval)";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBoard_name());
			ps.setString(2, board.getBoard_writer());
			ps.setString(3, board.getBoard_date());
			ps.setString(4, board.getBoard_src());
			ps.setString(5, board.getBoard_comment());
			ps.setInt(6, board.getBoard_folder());
			ps.setInt(7, board.getBoard_cnt());
			ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
