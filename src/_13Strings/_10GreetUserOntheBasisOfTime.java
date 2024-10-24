package _13Strings;

import java.util.Scanner;

public class _10GreetUserOntheBasisOfTime {


	public static void greetUser(int time,char part) {
		if(time>=1 && time<=12) {
		    if(time>=1 && time<=4||part=='p' ){
				System.out.println("Good Afternoon!");

			}
			else if(time>=4 && time<=7||part=='p'){
				System.out.println("Good Evening!");

			}
			else if(part=='a') {
				System.out.println("Good Morning!");
			}
			
		}
		
		}

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.print("Enter time here:");
		int time=ref.nextInt();
		System.out.print("Enter a for am and p for pm:");
		char part=ref.next().charAt(0);		 
		greetUser(time,part);
		
	}
}
