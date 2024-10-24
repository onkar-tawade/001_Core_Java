package _1programStart;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
//////How many Even numbers
//		int i,count=0;
//		for(i=50;i<=100;i++)
//		{
//			if(i%2!=0) {
//				System.out.print(i+" ");
//              count++;
//			}
//		
//		}
//		System.out.println("\nEven numbers in 1 to 50 is:"+count);
		
		//////////////Even and odd numbers....
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				System.out.println("Odd:"+i);
//			}
//			else {
//				System.out.println("Even:"+i);
//			}
//		}
		/////Vowels print and count
////		int count=0;
//		for(char ch='A';ch<='Z';ch++) {
//			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//				System.out.println("Vowel:"+ch);
//			}
//			else {
//				System.out.println("Consonant:"+ch);
//
//			}
//		}
int a=5,b=3,temp;
//temp=a;a=b;b=temp;///Using third variable...
a=a+b;///Without using third variable.....
b=a-b;
a=a-b;
System.out.println(a+" "+b);
  
	}

}
