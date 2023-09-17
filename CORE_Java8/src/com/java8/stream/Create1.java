package com.java8.stream;

import java.util.stream.Stream;

public class Create1 {

	public static void main(String[] args) {

		Stream<Integer> sm1 = Stream.of(10, 11, 12, 13, 14, 15, 16);
		sm1.forEach(System.out::println);

		Float arr[] = { 1.1f, 2.2f, 3.3f, 4.4f };
		Stream<Float> sm2 = Stream.of(arr);

		sm2.forEach(System.out::println);
		
		Stream<Double> sm3 = Stream.generate(()->{return Math.random();});
		sm3.forEach(System.out::println);
	}

}
