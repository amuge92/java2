package teamp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class oracle {

	public static void main(String[] args) throws SQLException {
		Connection conn = null; // DB�� �����ϴ� �������̽�
		PreparedStatement pstm = null; // sql�� ��ü
		ResultSet r = null;// sql�� ���� ��ȯ

		try {
			String que = "select * from book_list";
			conn = DB.get();
			pstm = conn.prepareStatement(que);
			r = pstm.executeQuery();
			while (r.next()) {
				String empno = r.getString(1);
				System.out.println(empno);
			}
		} catch (SQLException e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
		r.close();
		pstm.close();
		conn.close();

	}

}
