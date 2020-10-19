package co.soft.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.MapClass;
import co.soft.beans.data1;

@Controller
public class Test {

//	@GetMapping("/t1")
//	public String t1(HttpServletRequest request) {
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
//		String c = request.getParameter("c");
//		System.out.println(a + b + c);
//		return "result";
//	}
//
//	@PostMapping("/t2")
//	public String t2(HttpServletRequest request) {
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
//		String c = request.getParameter("c");
//		return "result";
//	}
//
//	@GetMapping("/t3")
//	public String t3(WebRequest request) {
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
//		String c = request.getParameter("c");
//		return "result";
//	}
//
//	@GetMapping("/t4/{a}/{b}/{c}")
//	public String t4(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
//		System.out.println(a + b + c);
//		return "result";
//	}
//
//	@GetMapping("/t5")
//	public String t5(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
//		System.out.println(a + b + c);
//		return "result";
//	}
//
//	@GetMapping("/t6")
//	public String t6(@RequestParam Map<String, String> map) {
//		String data1 = map.get("data1");
//		String data2 = map.get("data2");
//		System.out.println(data1);
//		System.out.println(data2);
//		return "result";
//	}
//
//	@GetMapping("/t7")
//	public String t7(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
//		String data1 = map.get("data1");
//		String data2 = map.get("data2");
//		System.out.println(data1);
//		System.out.println(data2);
//		for (String a : data3) {
//			System.out.println(a);
//		}
//		return "result";
//	}
//
////@ModelAttribute 
////파라미터를 객체로 주입받을 수 있다.	 갱장히 중요한 작업
////전달되는 파라미터의 이름과 동일한 프로퍼티에 자동으로 주입이된다. =>커맨드 객체
//	@GetMapping("/t8")
//	public String t8(@ModelAttribute data1 d1) {
//		System.out.println(d1.getData1());
//		System.out.println(d1.getData2());
//		for(int a : d1.getData3()) {
//		System.out.println(a);}
//		return "result";
//	}
//
//	@GetMapping("/t1")
//	public String t9() {
//
//		return "t1";
//	}
//
//	@GetMapping("/t2") // 리퀘스트스코프로 받을 수 있다.
//	public String t10(HttpServletRequest request) {
//		request.setAttribute("data1", 10);
//		request.setAttribute("data2", 300);
//		return "t1";
//	}
//
//	@GetMapping("/t3")
//	public String t11(Model model) {
//		model.addAttribute("data1", 30);
//		model.addAttribute("data2", 80);
//		return "t1";
//	}
//
//	@GetMapping("/t4")
//	public ModelAndView t12(ModelAndView ma) {
//		ma.addObject("data1", 50);
//		ma.addObject("data2", 90);
//		ma.setViewName("t1");
//
//		return ma;
//
//	}
//
//	@PostMapping("/t11")
//	public String t11(@ModelAttribute data1 d1) {
//		System.out.println(d1.getData1());
//		System.out.println(d1.getData2());
//		return "t1";
//	}
//	@PostMapping("/t12")//jsp에 넘길 클래스네임을 변경할수있다
//	public String t12(@ModelAttribute("d") data1 d1) {
//		System.out.println(d1.getData1());
//		System.out.println(d1.getData2());
//		return "t1";
//	}
//	@GetMapping("/t1")
//	public String t1(data1 d1) {
//		d1.setName("shin");
//		d1.setId("sjwsrh");
//		d1.setPw("1234");
//		return "t1";
//	}
//
//	@GetMapping("/t2")
//	public String t2(@ModelAttribute("ma") data1 d1) {
//		d1.setName("choi");
//		d1.setId("sjwchoi");
//		d1.setPw("12343");
//		return "t2";
//	}
//
//	@GetMapping("/t3")
//	public String t3(Model model) {
//		data1 d1 = new data1();
//		d1.setName("le");
//		d1.setId("os");
//		d1.setPw("Ta");
//		model.addAttribute("d1", d1);
//		return "t3";
//	}

	@GetMapping("/t1")
	public String t1(@RequestParam String su1, @RequestParam String su2) {
		return "t1";
	}

	@GetMapping("/t2")
	public String t2(Model model) {
		model.addAttribute("su1", 20);
		model.addAttribute("su2", 30);
		return "t1";
	}

	@GetMapping("/t3")
	public ModelAndView t3(ModelAndView mv) {
		mv.addObject("su1",200);
		mv.addObject("su2",1000);
		mv.setViewName("t1");
		return mv;
	}
	@GetMapping("/t4")
	public String t4(@ModelAttribute data1 bean) {
		bean.setName("name");
		bean.setId("id");
		return "t1";
	}
	
	@GetMapping("/t6")
	public String t6(@RequestParam Map<String, String> map) {
		String data1 = map.get("su1");
		String data2 = map.get("su2");
		return "t1";
	}
}
