package _1programStart;

public class _16starp8 {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=13;i++) {
			for(j=1;j<=5;j++) {
				
				if(i==1&&j==2||i==1&&j==4||i==5&&j==1||i==5&&j==5)System.out.print("  ");
			else if(j==3||i==5||j==2&& i<=4||i==1&&j==1||j==4&&i<=5||i==1&&j==5) {
					System.out.print("* ");
				}
				else System.out.print("  ");

			}
			System.out.print("\n");
		}
	}

}
