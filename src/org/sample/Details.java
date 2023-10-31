package org.sample;

public class Details {
	public Details() {
		this(30);
		System.out.println("default constructor");
	}

	public Details(int age) {
		this("gowtham");
		System.out.println("int constructor");
		System.out.println(age);
	}
	public Details(String name) {
		this(1234567890l);
		System.out.println("String constructor");
		System.out.println(name);
	}

	public Details(long phonenumber) {
		System.out.println("long constructor");
		System.out.println(phonenumber);
	}
	
	public static void main(String[] args) {
		Details d= new Details();
		
	}
	

}
