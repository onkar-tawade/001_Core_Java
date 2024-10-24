package _1programStart;

public class _3PrimeNumber {
	public static void main(String []args) {
		int n=4,count=0,m=1;
		////Using for loop
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) System.out.println(n+" is prime number.");
//		else System.out.println(n+" is non-prime number.");
		
		
		////Using while loop

//		while(n>=m) {
//			if(n%m==0) {
//				count++;
//			}
//			m++;
//
//		}
//		if(count==2) System.out.println(n +" is prime");
//		else System.out.println(n +" is  non-prime");
		
		////Using do while loop

		do {
			if(n%m==0) {
				count++;
			}
			m++;
			
		}while(n>=m);
		if(count==2) System.out.println(n +" is prime");
		else System.out.println(n +" is  non-prime");
	}

}
