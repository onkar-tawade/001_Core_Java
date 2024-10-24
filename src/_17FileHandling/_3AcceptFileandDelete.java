package _17FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _3AcceptFileandDelete {  ////...Here we create and delete the files.......
	
	public static void main(String[] args) throws IOException {
		
		Scanner ref=new Scanner(System.in);
		System.out.print("Enter the file name with Extension:");//////Provide with Extension
	    String fName=ref.next();
		
		File f=new File("D:\\"+fName);
		
		f.createNewFile();
		System.out.println("File Created...");
		
		f.delete();
		System.out.println("File Deleted...");

		
	}

}


