package co.soft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/minigame")
public class GameController {
	@RequestMapping(value = "/minigame2", method = RequestMethod.GET)
	public String minigame2(HttpServletRequest request,HttpSession session) {
		String check1 = request.getParameter("check1");
		session.setAttribute("che1", check1);
		
		String check2 = request.getParameter("check2");
		session.setAttribute("che2", check2);
		
		return "minigame2/minigame2";
	}
	
	@RequestMapping(value = "/minigame1", method = RequestMethod.GET)
	public String minigame1(HttpServletRequest request,HttpSession session) {
		String check1 = request.getParameter("check1");
		session.setAttribute("che1", check1);
		
		String check2 = request.getParameter("check2");
		session.setAttribute("che2", check2);
		return "minigame2/minigame1";
	}
	
	
	
}
