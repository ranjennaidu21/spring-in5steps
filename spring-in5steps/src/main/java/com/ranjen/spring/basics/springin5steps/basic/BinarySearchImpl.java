package com.ranjen.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//BS: to check scope of the bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	//if there are two bean implementing same interface, we can choose which bean by 3 ways (AM-Autowiring ways)
	//AM-1: specifying the bean name as below(refactor: eg change
	// quickSortAlgorithm to bubbleSortAlgorithm)
	//this is recommended instead of putting third way AM-3 by mentioning Qualifier as need to change in other file as well
	//private SortAlgorithm quickSortAlgorithm;
	
	//AM-2 : or add @Primary in the bean class which have higher precedence regardless of name mentioned here. 
	//private SortAlgorithm sortAlgorithm;
	
	//AM-3 : or Using Qualifiers to mention it refer which bean
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

}
