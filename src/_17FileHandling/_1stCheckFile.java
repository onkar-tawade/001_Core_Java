package _17FileHandling;

import java.io.File;
import java.util.Scanner;

public class _1stCheckFile {

	public static void main(String[] args) {

		System.out.println("Enter name which you want to give the File:");
		Scanner ref=new Scanner(System.in);
		String fName=ref.next();
		
		File f=new File("D:\\"+fName+".txt");
		System.out.println(f.exists());
	}

}
