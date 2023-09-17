package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Convert2 {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			lst.add(i);
		}

		// Convert this list into Stream using stream
		Stream<Integer> sm = lst.stream();

		Integer[] arr = sm.filter(i -> i < 5).toArray(Integer[]::new);
		for (Integer i : arr)

			System.out.println(i);
	}

}
