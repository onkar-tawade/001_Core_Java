package _20CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1stQueueTask {

	public static void main(String[] args) {

		Queue<String> list= new LinkedList<String>() ;
		
		Scanner sc=new Scanner(System.in);
		for (int i = 1; i <=5 ; i++) {
			System.out.println("Enter the process "+i+":");
            list.add(sc.next());
		}
		
		System.out.println(list);
		
		System.out.println(list.peek());////         Head of queue find out here used peek method....
	}

}
