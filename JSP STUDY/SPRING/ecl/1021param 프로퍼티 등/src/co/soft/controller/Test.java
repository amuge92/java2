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
import javax.validation.Valid;

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
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
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

import co.soft.beans.data1;

@Controller
public class Test {

	@GetMapping("/input")
	public String input(data1 d1) {

		return "input";
	}

	@PostMapping("/in")
	public String in(@Valid data1 d1, BindingResult r) {
		if (r.hasErrors()) {
			return "input";
		}
		return "pass";
	}

//	@GetMapping("/input")
//	public String input() {
//
//		return "input";
//	}

//	@PostMapping("/in")
//	public String in(@Valid data1 d1, BindingResult r) {
//		if (r.hasErrors()) {
//			for (ObjectError o : r.getAllErrors()) {
//				System.out.println(o.getDefaultMessage());
//				System.out.println(o.getCode());
//
//				String[] co = o.getCodes();
//
//				for (String a : co) {
//					System.out.println("코즈" + a);
//					if (a.equals("Size.data1.s1")) {
//						System.out.println("s1에서 에러났따. 2~10글자");
//					} else if (a.equals("Max.data1.s2")) {
//						System.out.println("s2에서 에러났다. 100이하");
//					}
//				}
//
//			}
//			return "input";
//		} else {
//
//			return "pass";
//		}
//
//	}

}
