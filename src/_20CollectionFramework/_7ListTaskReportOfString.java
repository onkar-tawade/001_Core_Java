package _20CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _7ListTaskReportOfString {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		
		int nChar=0,nAlpha=0,nVowels=0,nCons=0,nDigits=0;
		
		System.out.println("Enter 3 Strings:");
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());

		
		for (String str : list) {
			for (int i = 0; i < str.length(); i++) {
          	       nChar++;

	              if(str.charAt(i)>= 'a' && str.charAt(i)<= 'z') {
	            	  nAlpha++;
	            	  if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'  ) {
	            		  nVowels++;
	            	  }
	            	  else {
	            		  nCons++;
	            	  }
	              }
	              if (str.charAt(i)>= '0' && str.charAt(i)<='9') {
					nDigits++;
				}
	              
	              
	              
			}
		}
		
		System.out.println("No. of Character is:"+nChar);
		System.out.println("No. of Alphabets is:"+nAlpha);
		System.out.println("No. of Vowels is:"+nVowels);
		System.out.println("No. of Consonants is:"+nCons);
		System.out.println("No. of Digits is:"+nDigits);
		System.out.println("No. of Special characters is:"+(nChar-(nAlpha+nDigits)));


	}

}
