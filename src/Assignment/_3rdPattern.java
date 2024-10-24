package Assignment;

public class _3rdPattern {

	public static void main(String[] args) {
               /*
                A B C D E 
                A B C D 
                A B C 
                A B 
                A
                */
//		char i,j;
//		for(i='E';i>='A';i--) {
//			for(j='A';j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/*  1 2 3 4 5 
            1 2 3 4 
            1 2 3 
            1 2 
            1           */
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
