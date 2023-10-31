package org.sample;

public class Detailssuper extends Details1{

	public Detailssuper() {
		super(30);
		System.out.println("child paramaterised constructor");
	}
	
	public Detailssuper(String name) {
		super("gowtham");
		System.out.println("String paramaterised constructor");
	}
	public static void main(String[] args) {
		Detailssuper s=new Detailssuper();
	}
	

}
