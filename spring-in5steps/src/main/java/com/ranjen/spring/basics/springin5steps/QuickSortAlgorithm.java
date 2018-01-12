package com.ranjen.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//AM-3 : Using qualifier 
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}
