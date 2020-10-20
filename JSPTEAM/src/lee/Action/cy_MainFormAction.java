package lee.Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

public class cy_MainFormAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
//		Cookie c = new Cookie("id", request.getParameter("id"));
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		session.setAttribute("id", id);
		session.setMaxInactiveInterval(60*24*60);
		RequestDispatcher r = request.getRequestDispatcher("cy_MainForm.jsp");
		r.forward(request, response);
	}

}
