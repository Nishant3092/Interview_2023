package com.blackbook.nish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programme71 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A character :- ");
		
		char ch = (char)br.read();
		
		System.out.println("You Entered Character----"+ch);
       
	}

}
