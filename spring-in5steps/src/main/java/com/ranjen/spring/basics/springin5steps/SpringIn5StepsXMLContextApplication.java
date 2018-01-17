package com.ranjen.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ranjen.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	
	//Check in applicationContext how the XmlJdbcConnection is autowired to this XmlPersonDAO without using any annotation
	//and just by using XMLFILES. Old method and difficult to maintain. Better use annotation.
	public static void main(String[] args) {
		//For XMLBased we will use ClassPathXmlApplicationContext by pass the location of the XML Configuration
		//instead of others eg:AnnotationConfigApplicationContext
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}