package _16ExceptionHandlling;

import java.util.Scanner;

public class _2ExceptionTakingValuesFromUser {

	public static void main(String[] args) {

		int arr[]= {10,20,30,0,50,60,70,80,90,100};
		Scanner ref=new Scanner(System.in);
		System.out.print("Enter 1st num:");
		int num1=ref.nextInt();
		System.out.print("Enter 2nd num:");
		int num2=ref.nextInt();
		
		try {
			int num=arr[num1]/arr[num2];
			System.out.println(num);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
             System.out.println("Invald index num...");
			
		}
		catch ( ArithmeticException e) {
			
            System.out.println("Invalid number...");
			
		
	}
	}
}
