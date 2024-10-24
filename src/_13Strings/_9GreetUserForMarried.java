package _13Strings;

import java.util.Scanner;

public class _9GreetUserForMarried {
	
	public static void greetUser(String name,char gender,char status) {
		if(gender=='m') {
			if(status=='M') {
				System.out.println("Hello Mr."+name);
			}
			else {
				System.out.println("Hello Master "+name);

			}
		}
		else {
			if(status=='M') {
				System.out.println("Hello Mrs."+name);
			}
			else {
				System.out.println("Hello Miss "+name);

			}
		}
	}
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.print("Enter your Name:");
		String name=ref.next();
		System.out.print("Enter m if you are male or f for feamle:");
		char gender=ref.next().charAt(0);
		System.out.print("Enter M for married status or N for not-married :");
		char status=ref.next().charAt(0);		 
		greetUser(name, gender, status);
		
	}

}
