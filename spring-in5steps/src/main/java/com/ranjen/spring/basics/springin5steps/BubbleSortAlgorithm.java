package com.ranjen.spring.basics.springin5steps;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//if you put Primary here , when interface SortAlgorithm is injected to the BinarySearchImpl , it will take this as bean 
//to be injected instead of the QuickSortAlgorithm bean.
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
