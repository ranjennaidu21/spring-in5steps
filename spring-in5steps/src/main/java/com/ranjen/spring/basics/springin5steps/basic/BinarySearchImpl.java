package com.ranjen.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//BS: to check scope of the bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	//if there are two bean implementing same interface, we can choose which bean by 3 ways (AM-Autowiring ways)
	//AM-1: specifying the bean name as below(refactor: eg change
	// quickSortAlgorithm to bubbleSortAlgorithm)
	//this is recommended instead of putting third way AM-3 by mentioning Qualifier as need to change in other file as well
	//private SortAlgorithm quickSortAlgorithm;
	
	//AM-2 : or add @Primary in the bean class which have higher precedence regardless of name mentioned here. 
	//private SortAlgorithm sortAlgorithm;
	
	//AM-3 : or Using Qualifiers to mention it refer which bean
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}
	
	@PostConstruct
	//check in log , this method is called once beans have been and all it dependency have benn initialized 
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	//check in log , this method is called once beans is removed or leave from the Spring IOC Application context after run the called method.
	//cannot see in the log for prototype bean because:
/*	In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: 
	the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, 
	with no further record of that prototype instance. Thus, although initialization lifecycle callback methods are called on all objects 
	regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. 
	The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding. 
	To get the Spring container to release resources held by prototype-scoped beans, try using a custom bean post-processor, 
	which holds a reference to beans that need to be cleaned up.*/
	public void preDestroy() {
		logger.info("preDestroy");
	}

}
