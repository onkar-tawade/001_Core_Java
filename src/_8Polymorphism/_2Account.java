package _8Polymorphism;

import java.util.Scanner;

public class _2Account {

	///Attributes
	private static String accNumber;
	private static String accHolder;
	private static double balance;
	
	////Constructor
//	public _2Account(String an, String ah, int bl) {
//		accNumber=an;
//		accHolder=ah;
//		balance=bl;
//	}

	////Methods
	public static void deposit(double amount) {
		balance+=amount;
		System.out.println(accHolder+" you deposit "+amount+" in your account.");
		displayInfo();

		
	}
	
	/////Method overloading for diff. transaction types
	
	public static void withdraw(double amount) {
		if(balance>=amount) {
		balance -=amount;
		System.out.println("You withdraw "+amount+" from your account.");
		}
		else {
			System.out.println(" Sorry insufficient Balance..");
		}
		displayInfo();
	}
	public static void withdraw(double amount,int limit) { ////////////Withdraw method overload.....
		if(balance>=amount && limit<4) {
		balance -=amount;
		System.out.println(accHolder+" you withdraw "+amount+" from your account.");
		}
		else {
			System.out.println(accHolder+" Sorry insufficient Balance..");
		}
		displayInfo();
	}
	
	public static void displayInfo() {
		System.out.println("Your  account no. is:"+accNumber);
		System.out.println("Account Holder is:"+accHolder);
		System.out.println("Now your account balance is:"+balance);
		System.out.println();

	}

	
	public static void main(String[] args) {

//		_2Account ref=new _2Account();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Name:");
		accHolder=sc.nextLine();
		System.out.print("Enter your Account number:");
		accNumber=sc.nextLine();
		
		System.out.print("Enter amount for Deposit:");
		deposit(sc.nextDouble());
		
		System.out.print("Enter amount for Withdraw:");
//		withdraw(sc.nextDouble(),sc.nextLine());
        withdraw(sc.nextDouble(),4);
		sc.close();
		
		
	}

}
