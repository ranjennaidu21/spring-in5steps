package com.ranjen.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Primary
//AM-2 : if you put Primary here , when interface SortAlgorithm is injected to the BinarySearchImpl , it will take this as bean 
//to be injected instead of the QuickSortAlgorithm bean.

//AM-3 : Using qualifier 
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
