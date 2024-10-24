package _20CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class _9MapTask2ndUsingObject {

	public static void main(String[] args) {
         Map<Integer,Employee> map= new HashMap<Integer,Employee>();
         
         Employee e1=new Employee();
         Employee e2=new Employee();
         Employee e3=new Employee();
         Employee e4=new Employee();

         
         
         e1.name="Omkar";
         e2.name="Shubham";
         e3.name="Prashant";
         e4.name="Pratik";

         
         e1.des="Manager";
         e2.des="Developer";
         e3.des="tester";
         e4.des="Teacher";

         
         e1.exp=100;
         e2.exp=644;
         e3.exp=1111;        
         e4.exp=8900;

         
         
         
         

         map.put(1, e1);
         map.put(2, e2);
         map.put(3, e3);
         map.put(4, e4);

         
//         System.out.println(map.size());        ///Size of  map

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your ID:");////Info  of entered ID
//         int id=sc.nextInt();  
//
//         if (map.containsKey(id)) {
//			System.out.println(map.get(id));
//		}
//         else {
//        	 System.out.println("There is no record found for your entering ID.\nPlease,Enter proper ID.");
//         }
         
         
         
         
         //////////here printing all Managers 
//      for (int i = 1; i <=map.size(); i++) {
//		if (map.get(i).des=="Manager") {
//			System.out.println(map.get(i).name);
//		}
//	}
      
         
         
         //////////here printing employees whose exp is greater than 5

//      for (int i = 1; i <=map.size(); i++) {
//		if (map.get(i).exp > 5) {
//			System.out.println(map.get(i).name);
//		}
//	}
         
         
         //////////here printing employees whose exp is maximum
         
         int maxExp = map.get(1).exp;
         
         for (int i = 2; i <= map.size(); i++) {
        	 
			if (i<=map.size()) {
				
				if (maxExp < map.get(i).exp) {
					
					maxExp = map.get(i).exp;
					
				}
				
				if(maxExp > map.get(i).exp) {
			    	
					maxExp = maxExp;
	
				}
			    
			}
		}
         
         System.out.println(maxExp);
         
         for (int i = 1; i <=map.size(); i++) {
			if (map.get(i).exp==maxExp) {
				System.out.println(map.get(i).name);
			}
		}
}
}
