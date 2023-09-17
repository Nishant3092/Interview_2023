package com.java8.sept2023;

import java.util.Arrays;


public class SumOfEvenNum {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(num)
				.filter(n -> n % 2 == 0).sum();
		
		System.out.println("Sum Of Even Number: - "+sum);

	}

}
