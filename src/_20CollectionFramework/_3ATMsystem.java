package _20CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _3ATMsystem {

	public static void main(String[] args) {

		Queue<Integer> list= new LinkedList<Integer>();
		int opr,amount=10000;
		int password=416521;
		list.add(amount);
		System.out.println("..........WELCOME TO YOUR ATM..........\n");

		do {
	        System.out.println("0-Exit,1-Checking amount,2-Add Money,3-Withdraw Money,4-Change Password,5-Check Transsactions");
		
		Scanner sc = new Scanner(System.in);
		opr=sc.nextInt();
		
		switch (opr) {
		case 0: 
			   break;
			   
		case 1: System.out.println("Your current available balance is:"+amount+"\n");
			   break;
			   
		case 2: System.out.print("Enter amount:");
		       int eAmount=sc.nextInt();
		       list.add(eAmount);
		       amount=amount+eAmount;
		       System.out.println("Amount added Successfully....\n");
			   break;
			   
		case 3: System.out.print("Enter amount:");
		        int eamount=sc.nextInt();
	            if(eamount<=amount) {
		        list.add(-eamount);
	            amount=amount-eamount;
		        System.out.println("Amount withdraw successfully....\n");
			   }
	            else {
	            	System.out.println("You have insufficient Balance...\n");
	            }
	            break;
			   
		case 4: System.out.print("For changing password enter current password:");
		        int currPass=sc.nextInt();
		        if(currPass==password) {
		        	System.out.print("Enter the New Password:");
		        	password=sc.nextInt();
		        	System.out.println("Your password change successfully....\n");
		        }
		        else {
		        	System.out.println("You enter wrong password...\n");
		        }
			   break;
			   
			   
		case 5:   System.out.println("Transactions on your account are following:");
			      System.out.println(list);
			      break;
			      
		default:
			break;
		}
		
		}while(opr!=0 && opr<6);
		
		System.out.println(".......THANK YOU !.......");

	}

}
