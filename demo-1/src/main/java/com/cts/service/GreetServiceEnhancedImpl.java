package com.cts.service;

public class GreetServiceEnhancedImpl implements GreetService{
	public  String greet(String userName) {
		return "Greeting"+userName;
	
	}
	private String Greeting;

	public String GreetServiceEnhancedImpl() {
		return Greeting; 
		
	}

	public String getGreeting() {
		return Greeting;
	}

	public void setGreeting(String greeting) {
		Greeting = greeting;
	}
}
