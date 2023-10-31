package org.sample2;

public class A {
	public static void main(String[] args) {
		int age=10;
		if (age>=18) {
			System.out.println("eligible for vote");	
		}
		else {
try {
    throw new AgeInvalidException();
		
}
catch(Exception e) {
	e.printStackTrace();
}
	
	
		}
		}
	
}
