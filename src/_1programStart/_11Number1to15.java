package _1programStart;

public class _11Number1to15 {

	public static void main(String[] args) {

		int count=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					count++;
				System.out.print(count+" ");
}
				if(j==2) {
					System.out.print(11-i+" ");
				}
				if(j==3) {
					System.out.print(7+i+" ");

				}
				if(j==4) {
					System.out.print(18-i+" ");
				}
				if(j==5) {
					System.out.print(10+i+" ");

				}

				
			}
			System.out.println();
		}
	}

}
