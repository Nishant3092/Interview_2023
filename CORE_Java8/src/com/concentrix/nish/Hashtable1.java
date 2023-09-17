package com.concentrix.nish;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Map<Integer,String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(11, "a");
		hashtable.put(null, "a");
		hashtable.put(null, null);
		
		System.out.println(hashtable.size());
		System.out.println(hashtable);
		

	}

}
