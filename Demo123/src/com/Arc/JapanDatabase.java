package com.Arc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JapanDatabase implements JapanComp {

	@Override
	public String JapanFast6GInternet() {
		
		return "japan Database";
	}

}
