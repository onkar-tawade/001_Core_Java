package Assignment;

public class _1stPattern {

	public static void main(String[] args) {
   /*   A 
		A B 
		A B C 
		A B C D 
		A B C D E    */
//		for (char i = 'A'; i <='E'; i++) {
//			for (char j = 'A'; j <=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.print("\n");
//		}
		
		/*
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5  */
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		

	}

}
}