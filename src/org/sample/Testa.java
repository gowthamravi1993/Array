package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Testa {
	public static void main(String[] args) {
		Test t=new Test();
		t.setEmpid(10);
		t.setEmpname("gowtham");
		t.setEmpphno(7339432873l);
		
		
		Test t1=new Test();
		t1.setEmpid(15);
		t1.setEmpname("hari");
		t1.setEmpphno(7339432877l);
		
//		user defined list
	List<Test> l = new ArrayList<>();
	l.add(t);
	l.add(t1);
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i).getEmpid());
		System.out.println(l.get(i).getEmpname());
		System.out.println(l.get(i).getEmpphno());
		
	}
	for (Test test : l) {
		System.out.println(test.getEmpid());
		
	
	
		
		
		
	}
	
	

	}}
