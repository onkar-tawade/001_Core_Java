package _19jdbcLearn;

public class Guesscode {

//	public static void main(String[] args) {
//
////		String c="Hello i love java";
////		int start=2,end=9;
////		char s[] = new char[end - start];
////		c.getChars(start,end-1,s,1);
////		System.out.print("(");
////		System.out.print(s);
////
////		System.out.print(")");
//		
//		
//		
//		
////		try {
////			System.out.println("Welcome to"+""+1/0);
////		} catch (ArithmeticException e) {
//// 
////			System.out.println("Infosys");
////		}
//	
//
//	}
	public static int empMethod() {
		return 1;
	}

}


  class permnantEmp extends Guesscode {
	 
		public static int empMethod() {
			return 100;
		}
		public static void main(String[]args) {
			Guesscode emp = new permnantEmp();
			System.out.println(emp.empMethod());

		}
	
}
