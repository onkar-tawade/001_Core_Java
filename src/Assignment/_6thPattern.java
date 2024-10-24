package Assignment;

public class _6thPattern {

	public static void main(String[] args) {
		/*              ABCDE
                         BCDE
                          CDE
                           DE
                            E               */
//             char i,j,k;
//             for(i='A';i<='E';i++) {
//            	 for(j=i;j<='E';j++) {
//            		 System.out.print(j);
//            	 }
//            	 System.out.println();
//            	 for(k='A';k<=i;k++) {
//            		 System.out.print(" ");
//            	 }
//             }
		
		/*               12345
                          2345
                           345
                            45
                             5            */
	    int i,j,k;
        for(i=1;i<=5;i++) {
       	 for(j=i;j<=5;j++) {
       		 System.out.print(j);
       	 }
       	 System.out.println();
       	 for(k=1;k<=i;k++) {
       		 System.out.print(" ");
       	 }
        }
	}

}
