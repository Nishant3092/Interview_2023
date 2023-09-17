package com.concentrix.nish;

import java.util.HashMap;

public class Programme4 {

	public static void main(String[] args) {
		
		HashMap<Employee, String> h = new HashMap<Employee, String>();
		
		h.put(new Employee("a"), "emp1");
		h.put(new Employee("b"), "emp2");
		h.put(new Employee("a"), "emp1 OVERIDDEN");
		
		System.out.println(h.size());
		System.out.println(h.get(new Employee("a")));

	}

}
