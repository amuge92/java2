package co.soft.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.Userinfo;
import co.soft.validator.UserValidate;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/join")
	public String join(@ModelAttribute("joinUserBean") Userinfo joinUserBean) {
		return "user/join";
	}
	@PostMapping("/join1")
	public String join1(@Valid @ModelAttribute("joinUserBean") Userinfo joinUserBean,BindingResult r) {
		if(r.hasErrors()) {
			return "user/join";	
		}
		return "user/join_success";
	}
	
	
	@GetMapping("/modify")
	public String modify() {
		return "user/modify";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "user/logout";
	}
	@InitBinder
	public void initBinder(WebDataBinder b) {
		UserValidate v1 = new UserValidate();
		b.addValidators(v1);
		
	}
	
	
	
}








