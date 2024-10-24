package _20CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2ndQueueTask {

	public static void main(String[] args) {
		
	Queue<Integer>list=new LinkedList<Integer>();
	int input;
	
do {
	
	System.out.println("Enter 0 for exit, 1 for add number ,2 for remove number ,3 for find peek, 4 for poll , 5 for clear all the elements:");	
	Scanner sc= new Scanner(System.in);
	input=sc.nextInt();
	
	switch (input) {
	case 0:
		    break;

	case 1: System.out.println("Enter number for Adding:");
	        list.add(sc.nextInt());
	       
	         break;

	case 2: System.out.println("Here remove the 1st number");
	        list.remove();
	        System.out.println(list);
	        
	        break;

	case 3: System.out.println("Here we find the peek of Linkedlist:");
	        System.out.println(list.peek());
	     
		    break;

	case 4: System.out.println("Here we poll the 1st number:");
	        list.poll();
	        System.out.println(list);
	       break;

	case 5:  System.out.println("Here we clear all elements.");
	        list.clear();
	        break;

	default:
		break;
	}
	
}while(input!=0 && input<6);
	
System.out.println("....You are Exit....");

	}
	

}
