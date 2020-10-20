package lee.Action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import lee.CyDAO.cy_boardDAO;
import lee.CyDAO.cy_musicDAO;
import lee.CyDAO.cy_photoDAO;
import lee.CyDAO.cy_videoDAO;
import lee.bean.cy_boardbean;
import lee.bean.cy_musicbean;
import lee.bean.cy_photobean;
import lee.bean.cy_videobean;

public class createAction implements Action {
	RequestDispatcher rd;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String src = request.getParameter("src");

		Date date = new Date();
		String bn = request.getParameter("boardvalue");
		HttpSession session = request.getSession(true);
		String id = (String) session.getAttribute("id");
		if (id.equals("osyee")) {
			id = "包府磊";
		} else {
			id = "规巩按";
		}

		switch (bn) {
		case "1":
			cy_boardDAO bdao = new cy_boardDAO();
			cy_boardbean bbean = new cy_boardbean();
			bbean.setBoard_name(name);
			bbean.setBoard_writer(id);
			bbean.setBoard_date(date.toLocaleString());
			bbean.setBoard_src(src);
			bbean.setBoard_comment("");
			bbean.setBoard_folder(0);
			bbean.setBoard_cnt(0);
			rd = request.getRequestDispatcher("cy_board.jsp");
			rd.forward(request, response);
			break;
		case "2":
			cy_musicDAO mdao = new cy_musicDAO();
			cy_musicbean mbean = new cy_musicbean();
			mbean.setMusic_name(name);
			mbean.setMusic_writer(id);
			mbean.setMusic_date(date.toLocaleString());
			mbean.setMusic_src(src);
			mbean.setMusic_comment("");
			mbean.setMusic_folder(0);
			mbean.setMusic_cnt(0);
			rd = request.getRequestDispatcher("cy_music.jsp");
			rd.forward(request, response);

			break;
		case "3":
			cy_videoDAO vdao = new cy_videoDAO();
			cy_videobean vbean = new cy_videobean();
			vbean.setVideo_name(name);
			vbean.setVideo_writer(id);
			vbean.setVideo_date(date.toLocaleString());
			vbean.setVideo_src(src);
			vbean.setVideo_comment("");
			vbean.setVideo_folder(0);
			vbean.setVideo_cnt(0);
			rd = request.getRequestDispatcher("cy_video.jsp");
			rd.forward(request, response);
			break;
		case "4":
cy_photoDAO pdao = new cy_photoDAO();
			cy_photobean pbean = new cy_photobean();
			pbean.setPhoto_name(name);
			pbean.setPhoto_writer(id);
			pbean.setPhoto_date(date.toLocaleString());
			pbean.setPhoto_src(src);
			pbean.setPhoto_comment("");
			pbean.setPhoto_folder(0);
			pbean.setPhoto_cnt(0);
			rd = request.getRequestDispatcher("cy_photo.jsp");
			rd.forward(request, response);
			break;
		}

	}

}
