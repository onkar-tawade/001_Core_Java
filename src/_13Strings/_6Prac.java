package _13Strings;

import java.util.Scanner;

public class _6Prac {
public static void main(String[] args) {
	Scanner ref=new Scanner(System.in);
	System.out.println("Enter your Password:");
	String str=ref.next();

	int sum=0;
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>='1' && ch[i]<='9') {
			sum+=(int)ch[i]-48;
		}
	}
	System.out.println(sum);
}
}
