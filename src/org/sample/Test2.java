package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// interface ref name=new classname
		List<Integer> li = new ArrayList<>();
//		List< Integer>  l= new ArrayList<>();
		
		// add() to add the value into thr list
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		li.add(20);
		li.add(100);

		System.out.println("Givren list:\n" + li);
		// size()
//		int size = li.size();
		System.out.println("length of the list;\n" + li.size());
		// get(index)
		Integer i = li.get(4);
		System.out.println(i);
		// index of(element)
		int index = li.indexOf(10);
		System.out.println(index);
		// last index of(element)
		int lastindexof = li.lastIndexOf(10);
		System.out.println(lastindexof);
		// add(index,element)
		li.add(7, 70);
		System.out.println(li);
		// set(index,element)
		li.set(3, 80);
		System.out.println(li);

		// remove(index)
		Integer remove = li.remove(3);
		System.out.println(li);
		// for loop
		System.out.println("forloop");
		for (int j = 0; j < li.size(); j++) {
			System.out.println(li);
		}

	}

}
