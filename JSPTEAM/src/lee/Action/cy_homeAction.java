package lee.Action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.CyDAO.cy_DAO;
import lee.CyDAO.cy_DAOfactory;
import lee.CyDAO.cy_boardDAO;
import lee.CyDAO.cy_musicDAO;
import lee.CyDAO.cy_photoDAO;
import lee.CyDAO.cy_videoDAO;
import lee.CyDAO.cy_visitorDAO;
import lee.bean.cy_boardbean;
import lee.bean.cy_musicbean;
import lee.bean.cy_photobean;
import lee.bean.cy_videobean;
import lee.bean.cy_visitorbean;

public class cy_homeAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		cy_DAOfactory df = new cy_DAOfactory();
		cy_DAO vdao  = df.getdao("videoDAO");
		cy_DAO bdao  = df.getdao("boardDAO");
		cy_DAO mdao  = df.getdao("musicDAO");
		cy_DAO pdao  = df.getdao("photoDAO");
		cy_visitorDAO vidao  = new cy_visitorDAO();
		
		Vector vv =  vdao.AllContents();
		cy_videobean vcon = (cy_videobean) vv.get(vv.size()-1);
		
		Vector bv =  bdao.AllContents();
		cy_boardbean bcon = (cy_boardbean) bv.get(bv.size()-1);
		
		Vector mv =  mdao.AllContents();
		cy_musicbean mcon = (cy_musicbean) mv.get(mv.size()-1);
		
		Vector pv =  pdao.AllContents();
		cy_photobean pcon =(cy_photobean) pv.get(pv.size()-1);
		
		Vector viv =  vidao.AllContents();
		cy_visitorbean vicon =  (cy_visitorbean) viv.get(viv.size()-1);
		
		request.setAttribute("vv", vv);
		request.setAttribute("bv", bv);
		request.setAttribute("mv", mv);
		request.setAttribute("pv", pv);
		request.setAttribute("viv", viv);
		request.setAttribute("vcon", vcon);
		request.setAttribute("bcon", bcon);
		request.setAttribute("mcon", mcon);
		request.setAttribute("pcon", pcon);
		request.setAttribute("vicon", vicon);
		RequestDispatcher r = request.getRequestDispatcher("cy_home.jsp");
		r.forward(request, response);
	}

}
