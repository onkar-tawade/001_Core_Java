package _14StringBufferAndStringBuilder;

import java.util.Iterator;
import java.util.Scanner;

public class _1st {
	
	  
	public static void main(String[] args) {
		
//		Scanner ref=new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String str=ref.next();
//		
//
//		StringBuffer modifiedName= new StringBuffer();
//
//		for (int i = 0; i < str.length(); i++) {
//			if (i%2==0) {
//	                 modifiedName.append(str.charAt(i));		
//			}
//			else {
//                modifiedName.append("#");		
//
//			}
//		}
//		System.out.println(modifiedName.toString());
		
		
		StringBuffer str=new StringBuffer();
		Scanner ref1=new Scanner(System.in);
		System.out.println("Enter your name:");
        str.append(ref1.next());
        
       for (int i = 0; i < str.length(); i++) {
		if (i%2!=0) {
			str.replace(i, i+1, "#");
		}
	}
       System.out.println(str);
	}

}
