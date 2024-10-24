package _13Strings;

import java.util.Scanner;

public class _8ValidORnot {
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter your Email id:");
		String email=ref.next();
		
		if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")) {
			System.out.println("Valid Email-id...");
		}
		else {
			System.out.println("Plz enter valid Email-id");
		}
		
	}

}
