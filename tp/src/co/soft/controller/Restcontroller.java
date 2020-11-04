package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	
@GetMapping("/random")
	public String minigame2(HttpServletRequest request) {
		
	
	String  ran = (int)Math.random()*6+"";
	return ran;
	}
	
	
	
}
