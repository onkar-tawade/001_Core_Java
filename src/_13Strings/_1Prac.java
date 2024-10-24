package _13Strings;

import java.util.Scanner;

public class _1Prac {

	public static void main(String[] args) {

		String str1;
		String str2;
		
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter 2 String values:");
		str1=ref.next();
		str2=ref.next();
		
		if(str1.equals(str2)) {
			System.out.println("The content/values are same.");
		}
		else 	System.out.println("The content/values are not same.");

	}

}
