package _12Arrays;

import java.util.Scanner;

public class _4charEquivalent {

	public static void main(String[] args) {

		int[]num=new int[2];
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i]=ref.nextInt();
		}
		for (int i = 0; i < num.length; i++) {

			System.out.println((char)num[i]);
		}
		
	
	
	
		

	}

}
