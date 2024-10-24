package _13Strings;

import java.util.Scanner;

public class _2Prac {
	
	public static void main(String[] args) {
		String username="Onkar";
		String password="Tawade";
		
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter Username here:");
		String uName=ref.next();
		System.out.println("Enter Password here:");
		String Pword=ref.next();
		
		if(username.equals(uName)) {
			if(password.equals(Pword)) {
				System.out.println("Validate Inputs!");
			}
			else {
				System.out.println("Invalid Password..");
			}
		}
		else {
			System.out.println("Invalid Username...");
		}
	}

}
