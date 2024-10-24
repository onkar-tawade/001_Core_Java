package _1programStart;

public class _15starp7 {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(i==5 ||j==5||i==1&&j>5 || j==9&&i>5 || i==9&&j<=5 ||j==1&&i<=5 
						                      ||i==3&&j==3||i==3&&j==7||i==7&&j==3||i==7&&j==7) {
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			System.out.print("\n");
		}
	}

}
