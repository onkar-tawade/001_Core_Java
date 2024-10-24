package _15Threads;

import java.util.Scanner;

public class _5EnterPassword {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		_6TimeRequredForPass  ref= new _6TimeRequredForPass();

		final int mPass=1234;
		

		ref.start();

		for (int i = 1; i <i+1; i++) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password:");
		int uPass=sc.nextInt();


		
		if(uPass==mPass) {
			break;
		}
		else {
			System.out.println("Wrong Password...!");

		}
		
	}
		

		ref.stop();

		System.out.println("Right Passsword..!");

		ref.display();
		
	}

}
