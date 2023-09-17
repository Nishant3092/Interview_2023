package com.blackbook.nish;

public class Methodgetvalue {

	public static void main(String[] args) {

		int res = Methodgetvalue.myMethod(10);

		System.out.println("Result Is----" + res);

	}

	private static int myMethod(int num) {
		return num * num;
	}

}
