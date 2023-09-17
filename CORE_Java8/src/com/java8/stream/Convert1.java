package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert1 {

	public static void main(String[] args) {

		// Create List to store Integer Objects
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			lst.add(i);
		}

		// Convert this list into Stream using stream
		Stream<Integer> sm = lst.stream();

		// Filter the elements which are greater than 5 and collect
		// them into a list using collect(Collectors.toList())
		List<Integer> lst1 = sm.filter(i -> i > 5).collect(Collectors.toList());

		// Display the new list
		System.out.println(lst1);
	}

}
