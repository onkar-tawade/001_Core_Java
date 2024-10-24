package _17FileHandling;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class _4acceptFolderNameAndListContent {

	public static void main(String[] args) {

       Scanner ref=new Scanner(System.in);
       System.out.println("Enter folder name to check its list:");
       String folderName=ref.next();
              
       File f=new File("D:\\"+folderName); 
       
//       System.out.println(Arrays.toString(f.list())); ////This also the way we can print the file names....
       
       for (String str : f.list()) {////also this way...
		System.out.println(str);
	}
       
       
//        String allFiles[]=f.list();          ////Also this way way we can print....
//        for (int i = 0; i < allFiles.length; i++) {
//		System.out.println(allFiles[i]);
//	}
       
	}

}
