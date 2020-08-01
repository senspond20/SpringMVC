package com.senshig.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.senshig.myapp.config.appServlet.ServletConfig;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
//		root-context.xml 을 대신한다.
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
//		servlet-context.xml을 대신한다.
		return new Class[] {ServletConfig.class};
 	}

//	<!-- Processes application requests -->
//	<servlet>
//		<servlet-name>appServlet</servlet-name>
//		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//		<init-param>
//			<param-name>contextConfigLocation</param-name>
//			<param-value>/WEB-INF/spring/appServlet/servlet-context.xml</param-value>
//		</init-param>
//		<load-on-startup>1</load-on-startup>
//	</servlet>
//		
//	<servlet-mapping>
//		<servlet-name>appServlet</servlet-name>
//		<url-pattern>*.do</url-pattern>
//	</servlet-mapping>
	

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.do"};
	}
	
//	@Bean
//	public UrlBasedViewResolver urlBasedResolver() {
//		UrlBasedViewResolver u = new UrlBasedViewResolver();
//		u.setOrder(1);
//		u.setViewClass(JstlView.class);
//		u.setPrefix("/WEB-INF/views/member");
//		u.setSuffix(".jsp");
//		return u;
//	}

}
