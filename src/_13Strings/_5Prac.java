package _13Strings;

import java.util.Scanner;

public class _5Prac {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter your Password:");
		String pWord=ref.next();

		char ch[]=pWord.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || ch[i]>='0' && ch[i]<='9')) {
				System.out.print(ch[i]+" ");
			}
		}
	}
	
}
