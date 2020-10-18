package co.soft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Spring MVC������Ʈ�� ���õ� ������ �ϴ� Ŭ���� 

@Configuration
//��Ʈ�ѷ� ������̼��� ????
@EnableWebMvc
//��ĵ�� ��Ű�� ����
@ComponentScan(basePackages = "co.soft.controller")
public class ServletAppContext {

	
}
