package com.Arc;

import org.springframework.stereotype.Component;


//Component denotes it is a bean 

@Component
public class Jio implements Sim {

	@Override
	public String Internet() {
		
		return "Jio Internet";
	}

	@Override
	public String Calling() {
		
		return "Jio calling";
	}

}
