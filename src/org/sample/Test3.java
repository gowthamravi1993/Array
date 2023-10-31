package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) { 
//		interface ref name=new classname
		List<Integer>li=new ArrayList<>();
//		add() to add the value into the list
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		li.add(20);
		System.out.println("Given list:\n"+li);
		Set<Integer> s= new LinkedHashSet<>();
//		add all()
		s.addAll(li);
		System.out.println("Remove the all duplicate"+s);
//		is empty()
		boolean Empty=s.isEmpty();
		System.out.println(Empty);
//		remove(value)
		s.remove(30);
		System.out.println(s);
		
//		retail All
		s.retainAll(li);
		System.out.println(s);  
		s.add(100);
		s.add(200);
//		remove All()
		s.removeAll(li);
		System.out.println(s);
//		contains(element)
		boolean contain=s.contains(30);
		System.out.println(contain);
//		equals(object)
		boolean e=s.equals(li);
		System.out.println(e);
		System.out.println("for each");
		for(Integer e1:s) {
		System.out.println(e1);
		}
		
	}	
}
