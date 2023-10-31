package org.sample2;

public class Mysingleton {
	static Mysingleton s = null;

	private Mysingleton() {

	}

	private static Mysingleton getInstance() {
		if (s == null) {
			s = new Mysingleton();

		}
		return s;
	}

	private void empid() {
		System.out.println("12345");
	}

	public static void main(String[] args) {
		Mysingleton t = getInstance();
		System.out.println(System.identityHashCode(t));
		t.empid();

		Mysingleton t1 = getInstance();
		System.out.println(System.identityHashCode(t1));
		t1.empid();
	}

}
