package com.cts.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApp implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext webCtx=new AnnotationConfigWebApplicationContext();
		webCtx.register(SpringWebMvcConfig.class);
		webCtx.setServletContext(ctx);
		
		
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher",new DispatcherServlet(webCtx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}	
}