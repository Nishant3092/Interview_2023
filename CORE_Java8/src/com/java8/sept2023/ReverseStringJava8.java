package com.java8.sept2023;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringJava8 {

	public static void main(String[] args) {
	
		String str = "My Name is Nishant Raj I am Java Developer";
		
		String reverseStr = Stream.of(str)
				.map(string -> new StringBuilder(string).reverse())
				.collect(Collectors.joining());
		
		//Print Both String 
		System.out.println("Actual String : -"+str);
		System.out.println("reverse String: -"+reverseStr);
		
		//Length Of Both String
		System.out.println("Actual String : "+str.length());
		System.out.println("Reverse String : "+reverseStr.length());
	}

}
