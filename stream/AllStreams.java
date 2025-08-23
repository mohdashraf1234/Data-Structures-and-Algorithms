package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AllStreams {
	public static void  main(String[] args)
	{
		//1.sum of  numbers
		/*List<Integer> list=Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);	
		System.out.println(sum);*/
		
		
		//2.Average   of Numbers 
		
		/*List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		double average =list.stream().
				        mapToInt(e->e)
		                .average()
		                .getAsDouble();
		System.out.println(average);*/
		
		
		//3.Number square average which is greater  than 100
		
		/*List<Integer> list=Arrays.asList(1,10,20,30,15);
		double avg=list.stream()
		.map(e->e*e)
		.filter(e->e>100)
		.mapToInt(e->e)
		.average()
		.getAsDouble();
		System.out.println(avg);*/
		
		//4.find odd and even number 
		/*List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer>  even=list.stream()
				.filter(e->e%2==0)
				.collect(Collectors.toList());
		System.out.println(even);*/
		
		//5.print numbers start with prefix 2 
		/*List<Integer> list=Arrays.asList(2,222,234,54,23,432,225);
		List<Integer> res = list.stream()
                .map(e -> String.valueOf(e))            // Convert each Integer to String
                .filter(e -> e.startsWith("2"))         // Keep only strings that start with "2"
                .map(Integer::valueOf)                  // Convert back to Integer
                .collect(Collectors.toList());          // Collect to a List
		System.out.println(res);*/
		
		
		//6.print duplicate
		
		
		/*List<Integer> list = Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);

		// Create a HashSet to track elements we've already seen
		Set<Integer> seen = new HashSet<>();

		// Stream through the list to find duplicate elements
		List<Integer> duplicate = list.stream()
		        // If 'add(n)' returns false, it means 'n' is already in 'seen' → it's a duplicate
		        .filter((Integer n) -> !seen.add(n))
		        // Remove any repeated duplicates, so each duplicate appears only once
		        .distinct()
		        .collect(Collectors.toList());	
		System.out.println(duplicate);*/
		
		//7.second max
		
		/*List<Integer> list=Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);
	    Optional<Integer> secondHighest=list.stream()
	    		.sorted(Comparator.reverseOrder()) //Sort the stream elements in descending order (reverse of natural order)
	    		.distinct()
	    		.skip(1)
	    		.findFirst();
	    System.out.println(secondHighest);*/
		
		
		//8. sort element ASC/DSC
		/*List<Integer> list=Arrays.asList(41,3,5,67);
		List<Integer> asc=list.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(asc);
		
		
		//desc
		List<Integer> desc=list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(desc);*/
		
		
		//get/ignore first 5 numbers using limit and scope 
		/*List<Integer> list=Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);
		List<Integer> getFive=list.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(getFive);
		
		int sum=list.stream()
				.limit(5)
				.reduce((p,q)->p+q)
				.get();
		System.out.println(sum);*/
		
		//skip
		
		/*List<Integer> list=Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);
		List<Integer> skipFive=list.stream()
				.skip(5)
				.collect(Collectors.toList());
		System.out.println(skipFive);
		
		int sum=list.stream()
				.skip(5)
				.reduce((p,q)->p+q)
				.get();
		System.out.println(sum);*/
		
		//10. get second Lowest 
		
		
		/*ist<Integer> list=Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);
	    Optional<Integer> secondLowest=list.stream()
	    		.sorted() //Sort the stream elements in descending order (reverse of natural order)
	    		.distinct()
	    		.skip(1)
	    		.findFirst();
	    System.out.println(secondLowest);*/
		
//		List<Integer> list=Arrays.asList(3, 1, 2, 4, 5, 5, 6, 6, 877, 34);
//		Set<Integer> seen=new HashSet<>();
//		List<Integer> dup=list.stream().
//				filter((Integer n)->!seen.add(n))
//				.distinct()
//				.collect(Collectors.toList());
//		System.out.println(dup);
		
	
	  
	}
	
	
	

}
