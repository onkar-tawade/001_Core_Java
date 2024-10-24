package Assignment;

public class _8thPattern {

	public static void main(String[] args) {
/*                           E
                            DE
                           CDE
                          BCDE
                         ABCDE              */
//		char i,j,k;
//		for(i='E';i>='A';i--) {
//			for(j=i;j>'A';j--) {
//				System.out.print(" ");
//			}
//			for(k=i;k<='E';k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		/*                     5
                              45
                             345
                            2345
                           12345            */
		int i,j,k;
		for(i=5;i>=1;i--) {
			for(j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(k=i;k<=5;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
