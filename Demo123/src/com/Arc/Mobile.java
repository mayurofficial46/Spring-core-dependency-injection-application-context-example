package com.Arc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		
		ApplicationContext context= new ClassPathXmlApplicationContext("Context.xml");
		
		Sim sim = context.getBean("airtel",Sim.class);
				
				System.out.println(sim.Internet());
			    System.out.println(sim.Calling());
	}

}
