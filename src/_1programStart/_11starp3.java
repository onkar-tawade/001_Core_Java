package _1programStart;

public class _11starp3 {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||i==3||i==5||i==2&&j==1||i==4&&j==5) {
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			System.out.print("\n");

		}
	}

}
