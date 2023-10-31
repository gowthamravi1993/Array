package org.sample2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Set {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(20);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.addAll(li);
		System.out.println(set);
		int size2 = set.size();
		System.out.println(size2);
		System.out.println(size-size2);
	
	
	}	

}
