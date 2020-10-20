package lee.Action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lee.bean.cy_videobean;

public class cy_visitorActionLE implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		RequestDispatcher r = request.getRequestDispatcher("cy_visitorLE.jsp");
		r.forward(request, response);
	}

}
