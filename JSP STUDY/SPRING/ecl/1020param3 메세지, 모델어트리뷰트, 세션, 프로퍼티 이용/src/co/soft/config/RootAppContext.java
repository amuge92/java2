package co.soft.config;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import co.soft.beans.data1;
import co.soft.beans.data2;

@Configuration
public class RootAppContext {

	@Bean
	@RequestScope
	public data1 d1() {
		return new data1();
	}	
	
//	@Bean
//	@ApplicationScope
//	public data2 d2() {
//		return new data2();
//	}
//	
	
	
	
//	@Bean
////	@Lazy
//	@SessionScope
//	public data1 ds11() {
//		return new data1();
//	}

}
