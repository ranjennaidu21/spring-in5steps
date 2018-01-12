package com.ranjen.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	//if there are two bean implementing same interface, we can choose which bean by specifying the bean name as below(refactor: eg change
	// quickSortAlgorithm to bubbleSortAlgorithm)
	private SortAlgorithm quickSortAlgorithm;
	
	//or add @Primary in the bean class which have higher precedence regardless of name mentioned here. 
	//private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		// Search the array
		return 3;
	}

}
