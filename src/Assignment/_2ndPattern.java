package Assignment;

public class _2ndPattern {

	public static void main(String[] args) {
            /*
	                 A
	                AB
	               ABC
	              ABCD
	             ABCDE   */
//		for (char i = 'A'; i <= 'E'; i++) {
//			for (char j = i; j < 'E'; j++) {
//				System.out.print(" ");
//			}
//			for (char k = 'A'; k <=i; k++) {
//				System.out.print(k);
//			}
//			System.out.print("\n");
//		}
		
		                          /*    1
                                       12
                                      123
                                     1234
                                    12345      */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}

}
