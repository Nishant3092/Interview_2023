package com.java8.sept2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsInList {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hello", "", "Nishnat", "", "!");
		String result = words.stream().collect(Collectors.joining());
		System.out.println("Join Words: " + result);

	}

}
