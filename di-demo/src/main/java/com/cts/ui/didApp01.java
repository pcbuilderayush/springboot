package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.service.greetService;
import com.cts.service.greetServiceSimpleImpl;
public class didApp01 {	
	public static void main(String args[]) 
	{		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		greetService gs= (greetService) context.getBean("g1");		
		System.out.println(gs.greet("Ayush"));	
		}
}