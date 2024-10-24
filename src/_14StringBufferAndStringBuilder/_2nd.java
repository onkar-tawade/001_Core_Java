package _14StringBufferAndStringBuilder;

import java.util.Scanner;

public class _2nd {
	
	public static void main(String[] args) {
		StringBuffer pass = new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password:");
		pass.append(sc.next());
		
		for (int i = 0; i < pass.length(); i++) {
			if ((pass.charAt(i)>='0' && pass.charAt(i)<='9'));
			else {
				System.out.print(pass.charAt(i));
			}
		}
	}

}
