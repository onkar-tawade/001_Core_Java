package _20CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class _9MapTask2nd extends _9Employeee {

	public static void main(String[] args) {

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
		String s5=emp5.empInfo("chaitanya", "Leader", 14);
		
		m.put(1, s1);
		m.put(2, s2);
		m.put(3, s3);
		m.put(4, s4);
		m.put(5, s5);

		
		System.out.println(m);

		
		
		

	}

}
