package co.soft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class HomeController {
//��Ʈ�ѷ� �޼ҵ尡 ��ȯ�ϴ� jsp�̸� �յڿ� ���, Ȯ���ڸ� �ٿ��ش�.	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String haaaome() {
		System.out.println("home");
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String gameok(HttpServletRequest request, Model mo, HttpSession session) {
		
		if (request.getParameter("clear").equals("true")) {
			mo.addAttribute("clear", "t");
		}
		
		String che1 = (String) session.getAttribute("che1");
        mo.addAttribute("che1",che1);
        System.out.println(che1);
        
        String che2 = (String) session.getAttribute("che2");
        mo.addAttribute("che2",che2);
        System.out.println(che2);
        
		return "index";
	}

}
