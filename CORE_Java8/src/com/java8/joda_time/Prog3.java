package com.java8.joda_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Prog3 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.printf("%nLocalDateTime object with current date & time :%n%s", dt);

		LocalDateTime dt1 = LocalDateTime.of(1991, Month.MAY, 30, 2, 30);
		System.out.printf("%n6 month from now :%n%s", dt.plusMonths(6));
		System.out.printf("%n6 months ago :%n%s", dt.minusMonths(6));

		DayOfWeek dw = dt.getDayOfWeek();
		String s = dw.name();
		System.out.printf("%nDay Of Week Name:%n%s", s);
		int n = dw.getValue();
		System.out.printf("%nDay Of Week Value:%n%s", n);
	}

}
