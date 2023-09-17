package com.concentrix.nish;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		// Integer index = 1;
		Integer i = 1;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
	
		/*list.remove(index);
		System.out.println(list);*/
		
		
		
		for(Integer num : list) {
			if(num == i) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}

}
