package _1programStart;


public class _20starp {

	public static void main(String[] args) {

//		/////Solution 1st.............................
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=i;k>=1;k--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=3;k>=i;k--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
		
		/////Question 2nd.............................
		/*
		             *
		           * * *
		         * * * * *
		 */

		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
