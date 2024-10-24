package _13Strings;

import java.util.Scanner;

public class _11AlternateCharacter {

	public static void main(String[] args) {

		String str;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter here username:");
		str=ref.next();
		
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

}
