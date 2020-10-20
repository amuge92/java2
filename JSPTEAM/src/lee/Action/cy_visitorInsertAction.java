package lee.Action;

import java.io.IOException;
import java.util.Date;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import lee.CyDAO.cy_visitorDAO;
import lee.bean.cy_videobean;
import lee.bean.cy_visitorbean;

public class cy_visitorInsertAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		HttpSession session = request.getSession(true);
		String id = (String) session.getAttribute("id");
		Date date = new Date();
		String mention = request.getParameter("mention");// 내용
		String command = request.getParameter("command");
		cy_visitorDAO cd = new cy_visitorDAO();
		cy_visitorbean bean = new cy_visitorbean();
		bean.setVisitor_comment(mention);
		bean.setVisitor_src("file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/방명이미지.png");
		bean.setVisitor_date(date.toLocaleString());
		if (id.equals("osyee")) {
			bean.setVisitor_writer("관리자");
		} else {
			bean.setVisitor_writer("방문자");
		}
		cd.insertContents2(bean);
		RequestDispatcher r = request.getRequestDispatcher("Mainservlet?command=cy_visitor.jsp");
		r.forward(request, response);
	}

}
