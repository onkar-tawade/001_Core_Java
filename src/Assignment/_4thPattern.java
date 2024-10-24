package Assignment;

public class _4thPattern {

	public static void main(String[] args) {
         /*
            ABCDE
             ABCD
              ABC
               AB
                A      */
//		char i,j,k;
//		for(i='E';i>='A';i--) {
//			for(j='A';j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.print("\n");
//			for(k='E';k>=i;k--) {
//				System.out.print(" ");
//			}
//		}	
		
		/*
		           12345
                    1234
                     123
                      12
                       1
		 */
		int i,j,k;
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
			for(k=5;k>=i;k--) {
				System.out.print(" ");
			}
		}
		
		
	}

}
