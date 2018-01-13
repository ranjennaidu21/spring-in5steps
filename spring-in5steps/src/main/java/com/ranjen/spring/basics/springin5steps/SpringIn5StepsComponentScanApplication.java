package com.ranjen.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ranjen.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
//ComponentScan: Normally will get No bean of type "xxx.ComponentDAO" available.
//Try to comment the annotation below. As per default when us the @SpringBootApplication annotation
//it will scan for all beans under this package and subpackages(springin5steps)
//In order to scan the component package which is outside of this springin5steps package , we need to tell Spring to scan for the
//component package to look for the bean by adding the @Component Scan annotation below.
//Before check all this make sure the bean have @Component annotation.
@ComponentScan("com.ranjen.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class); 
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		
	}
}