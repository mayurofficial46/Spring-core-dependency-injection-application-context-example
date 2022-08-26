package com.Arc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Component indicates it is a bean

@Component
public class Airtel implements Sim {
	
	@Autowired
	@Qualifier("japanDatabase")
	private JapanComp japancComp;

	@Override
	public String Internet() {
		
		//return "Airtel Internet";
		
		return japancComp.JapanFast6GInternet();
	}

	@Override
	public String Calling() {
		
		return "Airtel calling";
	}

}
