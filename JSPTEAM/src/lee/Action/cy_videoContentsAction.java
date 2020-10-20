package lee.Action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.CyDAO.cy_videoDAO;
import lee.bean.cy_videobean;

public class cy_videoContentsAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int vNum = Integer.parseInt(request.getParameter("vNum"));
		cy_videoDAO vd = new cy_videoDAO();
		cy_videobean video = null;
		try {
			video = (cy_videobean) vd.OneContets(vNum);
			vd.updateCount(vNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("video", video);
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher r = request.getRequestDispatcher("cy_videoContents.jsp");
		r.forward(request, response);
	}

}
