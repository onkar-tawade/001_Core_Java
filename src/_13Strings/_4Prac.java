package _13Strings;

import java.util.Scanner;

public class _4Prac {

	public static void main(String[] args) {

		Scanner ref=new Scanner(System.in);
		System.out.println("Enter here your Username:");
		String uName=ref.next();
		
		char ch[]=uName.toCharArray();

		System.out.println("No. of character in Username are:"+ch.length);
		int lCount=0;
		int vCount=0;
		int nCount=0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') {
				lCount++;
			}
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U') {
				vCount++;
			}
			if(ch[i]>='0' && ch[i]<='9') {
				nCount++;
			}
		}
		System.out.println("No. of Vowel in Username are:"+vCount);
		System.out.println("No. of Consonants in Username are:"+(lCount-vCount));
		System.out.println("No. of digits in Username are:"+nCount);
		System.out.println("No. of Extra symbols in Username are:"+(ch.length-(vCount+(lCount-vCount)+nCount)));
		
		
	}

}
