package _19jdbcLearn;

public class trytryButDontCry {

	
		public static int empMethod() {
			return 1;
		
	}

}

class permnantEmpgh extends trytryButDontCry {
	 
	public static int empMethod() {
		return 100;
	}
	public static void main(String[] args) {
		trytryButDontCry emp = new permnantEmpgh();
		System.out.println(emp.empMethod());
	}

}

