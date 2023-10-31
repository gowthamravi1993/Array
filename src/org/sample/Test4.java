package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		
		a.add(5);
		a.add(6);
		a.add(55);
		for (int i = 0; i < a.size(); i++) {
		System.out.println(a);	
		}
		System.out.println("each for");
		for (Integer integer : a) {
			System.out.println(integer);
		}
		
		
	
		
	}

}
