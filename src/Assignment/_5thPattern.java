package Assignment;

public class _5thPattern {

	public static void main(String[] args) {
	/*	
		ABCDE
		BCDE
		CDE
		DE
		E                */
//		char i,j;
//		for(i='A';i<='E';i++) {
//			for(j=i;j<='E';j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		/*
		          12345
                  2345
                  345
                  45
                  5
		 */
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=i;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
