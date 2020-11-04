package co.soft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	
	@RequestMapping(value = "/gkjoin", method = RequestMethod.GET)
	public String Join(HttpSession session) {
		
		session.removeAttribute("che1");
		session.removeAttribute("che2");
		//세션 속성 삭제
		
		System.out.println("회원가입 폼");
		return "gkjoin/gkjoin";
	}
}
