package com.java8.joda_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prog1 {

	public static void main(String[] args) {

		LocalDate todayDate = LocalDate.now();
		LocalTime time = LocalTime.now();

		System.out.println("Date : " + todayDate);
		System.out.println("Time : " + time);
	}

}
