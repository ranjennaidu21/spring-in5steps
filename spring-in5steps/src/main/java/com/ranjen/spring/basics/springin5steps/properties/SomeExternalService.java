package com.ranjen.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//This Service is called in the SpringIn5StepsPropertiesApplication where we mentioned which properties file to refer there
//in the @PropertySource annotation
public class SomeExternalService {
	
	//get the value from the properties file based on what mentioned inside the bracket and assign that to the url String field
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL(){
		return url;
	}

}
