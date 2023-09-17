package com.java8.joda_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Prog5 {

	public static void main(String[] args) {
		//LocalDate
		LocalDate localDate = LocalDate.now();
		
		LocalDate mybirthday = LocalDate.of(1991, Month.MAY, 30);
		LocalDate mybirthday1 = LocalDate.of(1994, Month.AUGUST, 27);
		
		Period p = Period.between(mybirthday, localDate);
		Period p1 = Period.between(mybirthday1, localDate);
		
		System.out.printf("You Are %d Years  %d Months And %d Days Older : ",
				p.getYears(),p.getMonths(),p.getDays());

		System.out.printf("You Are %d Years %d Months And %d Days Older : ",
				p1.getYears(),p1.getMonths(),p1.getDays());

	}

}
