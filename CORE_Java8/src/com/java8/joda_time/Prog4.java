package com.java8.joda_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Prog4 {

	public static void main(String[] args) {

		ZoneId zone = ZoneId.systemDefault();
		System.out.println("Current Time Zone : " + zone);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Date & Time In INDIA : " + dt);

		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println("Date & Timein Los Angeles " + zdt);
	}

}
