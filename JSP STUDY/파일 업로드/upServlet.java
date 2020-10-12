package aaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class upServlet
 */
@WebServlet("/upload.do")
public class upServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public upServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String save = "upload";
		int maxSize = 2 * 1024 * 1024 * 5;
		String envType = "UTF-8";
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(save);
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadFilePath, maxSize, envType,
					new DefaultFileRenamePolicy());
			Enumeration fi = multi.getFileNames();
			while(fi.hasMoreElements()) {
				String file = (String) fi.nextElement();
				String fi_name=multi.getFilesystemName(file);
				pw.print(fi_name);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
