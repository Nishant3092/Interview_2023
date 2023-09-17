package com.blackbook.nish;

public class Infiniteloop {

	public static void main(String[] args) {
		
		int x = 1;
		
		for(;;) {
			
			System.out.println(x);
			
			x++;
			if(x>20)break;
		}

	}

}
