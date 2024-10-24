package _15Threads;

import java.util.Scanner;

public class _3NameTask extends Thread{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		sc.useDelimiter("\n");

		System.out.println("Enter your Name:");
		String name=sc.next();
		
		
		try {

		             for(int i=0;i<=name.length()-1;i++) {
		            	 
		                 System.out.print(name.charAt(i));
		     			sc.useDelimiter("\n");

			                sleep(1000);
		            	 }
		          }
		
			catch ( Exception e) {
				
			}
		
	}
	}


