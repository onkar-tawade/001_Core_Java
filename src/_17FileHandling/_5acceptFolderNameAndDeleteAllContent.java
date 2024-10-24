package _17FileHandling;

import java.io.File;
import java.util.Scanner;

public class _5acceptFolderNameAndDeleteAllContent {

	public static void main(String[] args) {

		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the folder name for delete all Content of this:");
		String folderName=ref.next();
		
		File f=new File("D:\\"+folderName);
		
		String s[]=f.list(); //// s contains all files here...
		for (String str : s) { ///// so same str contains files of s....
			
			File f1=new File(f,str); ///// Here f represent the memory location of that file ,
			                                 ////and we know that str contains all the file list...
			f1.delete();            //// Here delete the f1 directly....
		}
		
        System.out.println("All files deleted Successfully...");        
        
        
}
		

}
