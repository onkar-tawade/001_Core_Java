package _16ExceptionHandlling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _3EnternumInString {

	public static void main(String[] args) {
		
    	Scanner ref=new Scanner(System.in);
		System.out.print("Enter any number in words:");

		try {
			int num=ref.nextInt();
			System.out.println(num*num);

		} 
		catch (InputMismatchException e) {
	    	Scanner ref2=new Scanner(System.in);

			System.out.println("Sorry...Here input mis-match...!");
             System.out.print("Enter number in number format:");
             int num2=ref2.nextInt();
             System.out.println(num2*num2);
			
		}
		
	}

}
