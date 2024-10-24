package _12Arrays;

import java.util.Scanner;

public class _3TableOfNumber {

	public static void main(String[] args) {
		int[]table=new int[10];
		System.out.print("Enter the number:");
		Scanner ref=new Scanner(System.in);
		int n=ref.nextInt();
		for (int i = 0; i<table.length; i++) {

			table[i]=n*(i+1);
		}
		System.out.println("Multiplication table of "+n);
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
	}

}
