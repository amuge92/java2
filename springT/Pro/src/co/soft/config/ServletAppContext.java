package co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.soft.intercepter.topintercepter;
import co.soft.mapper.BoardMapper;
import co.soft.mapper.topmapper;
import co.soft.service.topservice;

@Configuration
@EnableWebMvc

@ComponentScan("co.soft.controller")
@ComponentScan("co.soft.dao")
@ComponentScan("co.soft.service")

@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer {

	@Autowired
	private topservice tservice;
	
	@Value("${db.id}")
	String id;
	
	@Value("${db.pw}")
	String pw;
	
	@Value("${db.url}")
	String url;
	
	@Value("${db.ClassforName}")
	String ClassforName;

	@Bean
	public BasicDataSource data() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(ClassforName);
		source.setUrl(url);
		source.setUsername(id);
		source.setPassword(pw);
		return source;
	}

	// 孽府巩苞 立加 包府
	@Bean
	public SqlSessionFactory fac(BasicDataSource source) throws Exception {
		SqlSessionFactoryBean facbean = new SqlSessionFactoryBean();
		facbean.setDataSource(source);
		SqlSessionFactory fac = facbean.getObject();
		return fac;
	}

	@Bean
	public MapperFactoryBean<BoardMapper> mapper(SqlSessionFactory factory) {
		MapperFactoryBean<BoardMapper> fac = new MapperFactoryBean<BoardMapper>(BoardMapper.class);
		fac.setSqlSessionFactory(factory);
		return fac;
	}

	@Bean
	public MapperFactoryBean<topmapper> map(SqlSessionFactory factory) {
		MapperFactoryBean<topmapper> fac = new MapperFactoryBean<topmapper>(topmapper.class);
		fac.setSqlSessionFactory(factory);
		return fac;
	}

	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		topintercepter topinter = new topintercepter(tservice);
		InterceptorRegistration r1 = registry.addInterceptor(topinter);
		r1.addPathPatterns("/**");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer pr() {
		return new PropertyPlaceholderConfigurer();
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource me() {
		ReloadableResourceBundleMessageSource res=new ReloadableResourceBundleMessageSource();
		res.setBasename("/web-inf/properties/error");
		return res;
	}
	
}
