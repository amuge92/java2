package co.soft.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.MapClass;
import co.soft.beans.data1;
import co.soft.beans.data2;

@Controller
@SessionAttributes({ "session1", "session2", "ds11" })
//@PropertySource("/WEB-INF/pro/d1.properties")
//@PropertySource("/WEB-INF/pro/d2.properties")
//@PropertySource(value = {"/WEB-INF/pro/d1.properties","/WEB-INF/pro/d2.properties"})
@PropertySources({ @PropertySource("/WEB-INF/pro/d1.properties"), @PropertySource("/WEB-INF/pro/d2.properties") })

//세션영역에 저장되어 있는 객체를 사용하고자 할때 메소드의 매개변수이다.
//이 어노테이션을 설정하면 세션영역에 저장되어 있는 빈을 주입받을 수 있다.
public class Test {
	@RequestMapping(value = "/java")
	public String java() {
		return "java";
	}

	@RequestMapping(value = "/spring")
	public String spring(@ModelAttribute("m") data1 d1) {
		if (d1.getS1().equals("abcd")) {
			return "redirect:r1";
		} else {
			return "r1";
		}
	}
	@GetMapping("/r1")
	public String spring2() {
		System.out.println("r1지나가요");
		return "r1";
	}
	
	

//	@Autowired
//	ReloadableResourceBundleMessageSource res;
//
//	@GetMapping("p6")
//	public String p6(Model mo,Locale locale) {
//		System.out.println(locale);
//		String a1 = res.getMessage("aa.a1", null, null);
//		String b1 = res.getMessage("bb.b1", null, null);
//		
//		
//		Object[] ary = { 30, "유감" };
//		String a2 = res.getMessage("aa.a3", ary, null);
//		String a3 = res.getMessage("aa.a4", null,locale);
//		System.out.println(a1);
//		System.out.println(b1);
//		System.out.println(a3);
//		System.out.println(a2);
//		
//		mo.addAttribute("ary",ary);
//		return "p6";
//	}

//	@Value("${aa.a1}")
//	private int a1;
//	@Value("${aa.a2}")
//	private String a2;
//	@Value("${bb.b1}")
//	private int b1;
//	@Value("${bb.b2}")
//	private String b2;
//	@Value("${cc.c1}")
//	private int c1;
//	@Value("${cc.c2}")
//	private String c2;
//	@Value("${dd.d1}")
//	private int d1;
//	@Value("${dd.d2}")
//	private String d2;
//
//	@GetMapping("p5")
//	public String p5() {
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(d1);
//		System.out.println(d2);
//		
//		return "p5";
//	}

//	@GetMapping("/save")
//	public String save(HttpServletResponse response) throws Exception {
//		String d1 = URLEncoder.encode("문자", "UTF-8");
//		String d2 = URLEncoder.encode("문자", "UTF-8");
//
//		Cookie c1 = new Cookie("c1", d1);
//		Cookie c2 = new Cookie("c2", d2);
//		c1.setMaxAge(365 * 24 * 60 * 60);
//		c2.setMaxAge(365 * 24 * 60 * 60);
//		response.addCookie(c1);
//		response.addCookie(c2);
//
//		return "save";
//	}
//
//	@GetMapping("/cookie1")
//	public String cookie1(HttpServletRequest request) throws Exception {
//
//		Cookie[] c = request.getCookies();
//
//		for (Cookie co : c) {
//			String str = URLDecoder.decode(co.getValue(), "UTF-8");
//		if(co.getName().equals("c1")) {
//			System.out.println(str);
//		}else if(co.getName().equals("c2")) {
//			System.out.println(str);
//		}
//		
//		}
//
//		return "t1";
//	}
//
//	@GetMapping("/cookie2")
//	public String cookie2(@CookieValue("c1") String c1,@CookieValue("c2") String c2) {
//		
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		return "cookie2";
//		
//	}
//	
//	
//	@Autowired
//	data2 d2;
//
//	@GetMapping("/p3")
//	public String p3() {
//		d2.setS3("a");
//		d2.setS4("b");
//		return "p3";
//	}
//	@GetMapping("/r1")
//	public String r1(Model mo) {
//		System.out.println(d2.getS3());
//		return "r1";
//	}
//	

//
//	@Autowired
//	ServletContext app;
//	// 어플리케이션 스코프동안 사용할 수 있는 메모리 영역이 만들어진다.
//	// 서블릿콘텍스트라는 클래스 타입의 객체로 관리됨
//
//	// servletContext : httpservletrequest객체로 부터 추출가능 컨트롤러에서 주입받을 수 있다.
//
//	@GetMapping("/p2")
//	public String p2() {
//		app.setAttribute("s1", "승철");
//		data1 d1 = new data1();
//		d1.setS1("s1");
//		d1.setS2("s2");
//		app.setAttribute("d1", d1);
//		return "p2";
//	}
//
//	@Autowired
//	data1 ds11;
//	
//	@GetMapping("/p1")
//	public String p1(Model mo) {
//		ds11.setS1("asd");
//		ds11.setS2("asdf");
//		
//		mo.addAttribute("session", ds11);
//		return "p1";
//	}
//
//	@ModelAttribute("session1") // r1
//	public data1 session1() {
//		return new data1();
//	}
//
//	@ModelAttribute("session2") // r2
//	public data1 session2() {
//		return new data1();
//	}
//
//	@GetMapping("/r1")
//	public String r1(HttpSession session) {
//		session.setAttribute("s1", "승철");
//		return "r1";
//	}
//
//	@GetMapping("/r2")
//	public String r2(HttpSession session) {
//		session.setAttribute("s2", "승엽");
//		return "redirect:/t1";
//	}
//
//	@GetMapping("/t1")
//	public String t2(HttpSession session) {
//		return "t1";
//	}
//
//	@GetMapping("/r3")
//	public String r3(HttpSession session) {
//		session.setAttribute("s3", "물음표");
//		return "forward:/r4";
//	}
//
//	@GetMapping("/r4")
//	public String r4(HttpSession session) {
//		return "r4";
//	}
//
//	@GetMapping("/r5")
//	public String r5(HttpSession session) {
//		data1 d1 = (data1) session.getAttribute("session1");
//		d1.setS1("승철");
//		d1.setS2("오섭");
//		System.out.println(d1.getS1());
//		return "r5";
//	}
//
//	@GetMapping("/r6")
//	public String r6(HttpSession session) {
//		session.setAttribute("s6", "물음표");
//		return "r6";
//	}

}
