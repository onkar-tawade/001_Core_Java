package Assignment;

public class _7thPattern {

	public static void main(String[] args) {
/*
		E
		DE
		CDE
		BCDE
		ABCDE           */
		
//		char i,j;
//		for(i='E';i>='A';i--) {
//			for(j=i;j<='E';j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		/*       5
                 45
                 345
                 2345
                 12345
		  */
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=i;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
