package com.blackbook.nish;

public class Nestedloop {

	public static void main(String[] args) {
		
		int i=1,j;
	//Loop -1
		while (i<=3)
		{
			System.out.println(i);
			//Loop -2
			for(j=1; j<=5; j++) {
				
				System.out.println("\t"+j);
			}
			i++;
			System.out.println("************");
		}
	}

}
