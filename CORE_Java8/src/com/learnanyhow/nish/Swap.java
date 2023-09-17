package com.learnanyhow.nish;

public class Swap {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("NIshant");
		Animal a2 = new Animal("Raj");
		
		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);

		
	}
	
	public static void swap(Animal animal1, Animal animal2){
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
		
	}

}
