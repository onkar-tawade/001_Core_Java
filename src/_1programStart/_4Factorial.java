package _1programStart;

public class _4Factorial {

	public static void main(String[] args) {

		///////Factorial using while loop
//		int fact=1, n=5;
//		while(1<=n) {
//			fact=n*fact;
//            n--;
//		}
//		System.out.println(fact);
		
		///////Factorial using for loop

//		int num=5,fact=1;
//		for(int i=1;i<=num;i++) {
//			fact=i*fact;
//		}
//		System.out.println(fact);
		
		///////Factorial using do-while loop
		int num1=6,facto=1;
		do {
			facto=facto*num1;
			num1--;
		}while(1<num1);
		System.out.println(facto);
		

		
	}
	
}
