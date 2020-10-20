package lee.Action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.CyDAO.cy_boardDAO;
import lee.bean.cy_boardbean;
import lee.bean.cy_videobean;

public class cy_boardContentAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int vNum = Integer.parseInt(request.getParameter("vNum"));

		cy_boardDAO vd = new cy_boardDAO();
		cy_boardbean board = null;
		try {
			board = (cy_boardbean) vd.OneContets(vNum);
			vd.updateCount(vNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("board", board);
		RequestDispatcher r = request.getRequestDispatcher("cy_boardContent.jsp");
		r.forward(request, response);
	}

}
