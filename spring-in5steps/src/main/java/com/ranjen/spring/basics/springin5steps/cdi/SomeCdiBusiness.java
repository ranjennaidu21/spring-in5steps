package com.ranjen.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;
// CDI: To Use Spring CDI which is another alternative Standard annotation instead of using Spring Annotation. The output will be same as
// @Named used for @Component and @Qualifier
@Named //CDI Standard for for @Component
public class SomeCdiBusiness {
	
	//CDI Standard for for @Autowired
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
