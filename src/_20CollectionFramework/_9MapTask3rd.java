package _20CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _9MapTask3rd {

	public  String empInfo3rd(String name,String des,int exp) {
		String s=("Name of Employee is:"+name+", he is "+des+". They have "+exp+" years of experiance.\n");
		return s;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Map<Integer, String> m=new HashMap<Integer, String>();
		_9MapTask2nd emp1= new _9MapTask2nd();
		_9MapTask2nd emp2= new _9MapTask2nd();
		_9MapTask2nd emp3= new _9MapTask2nd();
		_9MapTask2nd emp4= new _9MapTask2nd();
		_9MapTask2nd emp5= new _9MapTask2nd();

		String s1=emp1.empInfo("Onkar", "Head", 10);
		String s2=emp2.empInfo("Shubham", "Manager", 11);
		String s3=emp3.empInfo("Pratik", "developer", 12);
		String s4=emp4.empInfo("Prashant", "Team-Manager", 13);
		String s5=emp3.empInfo("chaitanya", "Leader", 14);
		
		m.put(1, s1);
		m.put(2, s2);
		m.put(3, s3);
		m.put(4, s4);
		m.put(5, s5);

		System.out.println("enter your ID here:");
		int id=sc.nextInt();
		
		System.out.println(m.getOrDefault(id, "There is no record found for your entering ID.\nPlease,Enter proper ID."));
		
		
		
	}

}
