package _20CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _5ListTaskDomains {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your 5 id's:");
        ArrayList<String>list= new ArrayList<String>();
        ArrayList<String>list2= new ArrayList<String>();
        ArrayList<String>list3= new ArrayList<String>();


		list.add(sc.next());		
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		
			String name="";
		for (String id : list) {
		
			for (int i = 0; i < id.length(); i++) {
                if (i==0 || i==1 || i== id.length()-1 ||i== id.length()-2 ) {
				 name+=id.charAt(i);
				}
                list2.add(name);
                System.out.println();
				
			}
			}
		
		for (int i = 0; i < list2.size(); i++) {
			list3.add("Username is "+ list.get(i)+ " & password is #"+list2.get(i)+"123");
		}
		
		for (String string : list3) {
			System.out.println(string);
		}
	}

}
