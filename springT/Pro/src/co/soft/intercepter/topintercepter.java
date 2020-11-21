package co.soft.intercepter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.soft.beans.Boardinfo;
import co.soft.service.topservice;
//인터셉터는 오토와이어 불가능
public class topintercepter implements HandlerInterceptor {


	private topservice tservice;
	
	public topintercepter(topservice tservice) {
		this.tservice = tservice;
	}//생성자로 넘겨서 빈 주입 받음.... 인터셉터에서는 자동주입을 통해 빈 주입받지 못 한다...
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response) {
		List<Boardinfo> topmenu = tservice.get_toplist();
		request.setAttribute("topmenu", topmenu);
		
		return true;
	}
	
	
	
}
