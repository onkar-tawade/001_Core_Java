package _7Practical;

public class _3NumPattern {
	public static void main(String[] args) {

		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int k = 5-i; k >=1; k--) {
				System.out.print(k+" ");
			}
			
			System.out.println();
		}	
	}
}


