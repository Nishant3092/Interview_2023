package com.java8.sept2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Apple", "Guava", "Kivi", "Apple", "Pineapple");
		Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Grouped String: " + map);
		
		//Occurence Of Word Concept
		 long count = words.stream().filter(word -> word.equals("Apple")).count();
		 System.out.println("Occurence Of Apple : "+count);

	}

}
