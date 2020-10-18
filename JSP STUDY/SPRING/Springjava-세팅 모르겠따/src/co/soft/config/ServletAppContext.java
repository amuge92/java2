package co.soft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Spring MVC프로젝트에 관련된 설정을 하는 클래스 

@Configuration
//컨트롤러 어노테이션이 ????
@EnableWebMvc
//스캔할 패키지 지정
@ComponentScan(basePackages = "co.soft.controller")
public class ServletAppContext {

	
}
