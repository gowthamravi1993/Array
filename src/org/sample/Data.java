package org.sample;

public class Data {
	public static void main(String[] args) {
//		datatype [] variable=new data type[ size]
		int[]a=new int[5];
//		variable[index]=value;
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=10;
		System.out.println(a[1]);
		System.out.println(a[2]);
		
//		length
		
		int length=a.length;
		System.out.println("lengthof the array:"+length);
		
//		for loop
		System.out.println("for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//      enhanced for loop
		System.out.println("enhanced for loop/for each");
		for(int x:a) {
			System.out.println(x);
			
		}
		}
	}


