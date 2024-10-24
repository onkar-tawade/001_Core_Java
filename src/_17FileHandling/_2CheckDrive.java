package _17FileHandling;

import java.io.File;
import java.util.Scanner;

public class _2CheckDrive {

	public static void main(String[] args) {

		
		System.out.println("Enter drive for Checking:");
		Scanner ref=new Scanner(System.in);
		String uDrive=ref.next();
		
		File u=new File(uDrive+":\\");
		
		File che=u;

		System.out.println(che);
		
		File c=new File("C:\\");
		File d=new File("D:\\");
		File e=new File("E:\\");

		if (che!=c) {
			System.out.println("Exist");
		}
		if (che!=d) {
			System.out.println("Exist");
		}
		if (che==e) {
			System.out.println("Exist");
		}
		else {
			System.out.println("Not Exist");

		}
		System.out.println(d);
	}

}
