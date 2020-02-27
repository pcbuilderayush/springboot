package com.cts.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetServiceSimpleImpl;
import com.cts.service.GreetService;


public class DidApp01 {

	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		GreetService gs= (GreetService) context.getBean("g1");
		System.out.println(gs.greet("Ayush"));
		GreetService gs2= (GreetService) context.getBean("g2");
		System.out.println(gs2.greet("Ayush"));
	}
}
