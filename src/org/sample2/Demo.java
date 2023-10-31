package org.sample2;

public class Demo{
	public Demo() {
		this(10);
	System.out.println("parameterised constructor");
	

}

	public Demo(int age) {
		this("gowtham");
		
		System.out.println(age);
	}

	public Demo(String string) {
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
	}
	
}
  