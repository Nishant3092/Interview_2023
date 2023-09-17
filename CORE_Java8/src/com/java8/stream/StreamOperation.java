package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("INDIA", "USA", "JAPAN", "CHINA" ,"");

		long num = list.stream().filter(x -> x.length() > 4).count();
		System.out.println("Number Of String with Length MoreThan 4 :" + num);
		
		long num1 = list.stream().filter(x -> x.startsWith("I")).count();
		System.out.println("Number Of String with Length MoreThan 4 :" + num1);
		
		
		List<String> num2 = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Check Empty List :" + num2);

	}

}
