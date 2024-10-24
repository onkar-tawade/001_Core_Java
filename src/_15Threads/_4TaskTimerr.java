package _15Threads;

import java.util.Scanner;

public class _4TaskTimerr extends Thread{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time here in sec.:");
		int setTime=sc.nextInt();
		
		try {
			for (int i = setTime; i >=1; i--) {
				System.out.println(i);
				sleep(1000);
			}
			System.out.println("Finish...");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
