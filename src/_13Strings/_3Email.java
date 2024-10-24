package _13Strings;

import java.util.Scanner;

public class _3Email {

	public static void main(String[] args) {
		String email;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter your Email here:");
		email=ref.next();
		if(email.length()>=15) {
			int i;
			for ( i = 0; i < email.length(); i++) {
				if(email.charAt(i)== '@') {
					System.out.println("Valid email-ID");
					break;
				}
			}
			if(i==email.length()) {
				System.out.println("Missing @ symbol");
			}
		}
		else System.out.println(" Invalid email-ID");
	}
}
