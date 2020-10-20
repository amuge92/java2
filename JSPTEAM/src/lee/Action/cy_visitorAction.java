package lee.Action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.CyDAO.cy_visitorDAO;
import lee.bean.cy_boardbean;
import lee.bean.cy_videobean;
import lee.bean.cy_visitorbean;

public class cy_visitorAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		cy_visitorDAO vd = new cy_visitorDAO();
		Vector<cy_visitorbean> vcontents;
		vcontents = vd.AllContents();
		request.setAttribute("vcontents", vcontents);
		RequestDispatcher r = request.getRequestDispatcher("cy_visitor.jsp");
		r.forward(request, response);
	}

}
