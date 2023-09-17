package com.java8.joda_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prog2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();

		System.out.printf("\n%d-%d-%d", dd, mm, yy);

		LocalTime time = LocalTime.now();

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();

		System.out.printf("\n%d-%d-%d-%d", h, m, s, ns);
	}

}
