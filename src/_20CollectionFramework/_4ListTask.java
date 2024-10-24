package _20CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _4ListTask {

	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
		ArrayList<String>list= new ArrayList<String>();
		
		System.out.println("Enter 5 names:");
		list.add(sc.next());		
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		
		System.out.println("Names without vowels are:");
		for (String i: list) {
			for (int j = 0; j < i.length(); j++) {
				if(i.charAt(j)!= 'a' && i.charAt(j)!= 'e'&& i.charAt(j)!= 'i' && i.charAt(j)!= 'o' && i.charAt(j)!='u' &&
				i.charAt(j)!= 'A' && i.charAt(j)!= 'E'&& i.charAt(j)!= 'I' && i.charAt(j)!= 'O' && i.charAt(j)!='U') {
					System.out.print(i.charAt(j));
				}
			}
			System.out.println();
		}

		
	}

}
