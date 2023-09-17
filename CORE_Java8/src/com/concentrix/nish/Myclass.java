package com.concentrix.nish;

import java.util.PriorityQueue;

public class Myclass {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		

		System.out.println(q.poll());
		System.out.println(q);
	}

}
