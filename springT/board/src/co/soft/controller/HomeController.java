package co.soft.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.soft.beans.UserBean;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		
		//main�� ��Ʈ�ѷ��� ��û�Ѵ�./main�� ���� ��Ʈ�ѷ� ã�ƴٴ�.
		return "redirect:/main";
	}
}







