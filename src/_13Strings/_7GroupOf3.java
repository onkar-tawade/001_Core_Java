package _13Strings;

import java.util.Scanner;

public class _7GroupOf3 {

	public static void main(String[] args) {

		Scanner ref=new Scanner(System.in);
		System.out.println("Enter your Password:");
		String str=ref.next();
		
		for (int i = 0; i < str.length(); i+=2) {
			
			for (int j = i; j <i+2 && j< str.length() ; j++) {
				
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
