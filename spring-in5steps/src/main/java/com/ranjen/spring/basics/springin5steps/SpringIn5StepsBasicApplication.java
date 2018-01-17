package com.ranjen.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ranjen.spring.basics.springin5steps.basic.BinarySearchImpl;

//This @SpringBootApplication from Spring Boot will be replaced with Configuration for normal Spring app
//@SpringBootApplication
@Configuration
//this need to be specified to the the location to look for the bean, currently it will scan for all packages and sub-packages under this package
@ComponentScan 
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		
		
		// SpringApplication.run will be removed and replaced with new AnnotationConfigApplicationContext as we no longer using the Spring boot
/*		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);*/
		
		//Now for the log to work properly the applicationContext need to be closed and it has to be 
		//AnnotationConfigApplicationContext class to do that.
		//From Java 7 we can use the try catch as it will automatically close.
		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class))
		{
			BinarySearchImpl binarySearch = 
					applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 = 
					applicationContext.getBean(BinarySearchImpl.class);

			//BS : to check scope of the bean
			//singleton(default) - one instance per Spring context
			//prototype - new bean whenever requested
			//check in the console for the id if it return same bean each time it call or initiate a new bean again for the binarySearch1
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			int result = 
					binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);
		}
	}
}