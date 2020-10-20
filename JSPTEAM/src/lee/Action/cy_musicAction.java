package lee.Action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.CyDAO.cy_DAO;
import lee.CyDAO.cy_DAOfactory;
import lee.CyDAO.cy_musicDAO;
import lee.bean.cy_musicbean;
import lee.bean.cy_videobean;

public class cy_musicAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		cy_DAOfactory fd = new cy_DAOfactory();
		cy_DAO vd = fd.getdao("musicDAO");
		Vector vcontents = vd.AllContents();
		request.setAttribute("vcontents", vcontents);
		RequestDispatcher r = request.getRequestDispatcher("cy_music.jsp");
		r.forward(request, response);
	}

}
