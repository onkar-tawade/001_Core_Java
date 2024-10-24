package _20CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _6ListTaskBirdNameStartwithP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        ArrayList<String>list= new ArrayList<String>();
        System.out.println("Enter the name of 10 Birds:");
        for (int i = 1; i < 10; i++) {
            list.add(sc.next());
		}
       
        
        System.out.println("The birds start with P are:");
        for (String i : list) {

			if (i.startsWith("P") || i.startsWith("p")) {
				System.out.println(i);
			}
		}

	}

}
