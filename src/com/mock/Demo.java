package com.mock;

public class Demo {

	public float average(int a,int b,int c) {
		float avg=(a+b+c)/3;
		return avg;
	}
	public static void main(String[] args) {

		Demo ref= new Demo();
		float f=ref.average(10,10, 10);
		System.out.println("Average is:"+f);
		
	}

}
