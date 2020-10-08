package bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class param
 */
@WebServlet("/param")
public class param extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public param() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");
		String name = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		PrintWriter pr = response.getWriter();
		pr.print("<HTML><body>");
		pr.print(name);
		pr.print(age);
		pr.print("</body></HTML>");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=null;
			PreparedStatement ps = null;
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.8:1521/xepdb1", "Sys as sysdba",
					"Tareina!978");
			ps=con.prepareStatement("insert into param values(?,?)");
			ps.setInt(1, age);
			ps.setString(2, name);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		

	}

}
