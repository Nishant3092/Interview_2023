package com.java8.joda_time;

import java.time.Year;

public class Prog6 {

	public static void main(String[] args) {
		int n = 2015;
		Year y = Year.of(n);
		boolean flag = y.isLeap();
		
		if(flag)
			System.out.println("Year is Leap :"+n);
		else
			System.out.println("Year is not Leap :"+n);

	}

}
