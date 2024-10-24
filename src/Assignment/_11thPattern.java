package Assignment;

public class _11thPattern {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1)System.out.print(1+" ");
				else if(i==2 & j==2 || i==3 & j==2|| i==4 & j==2)System.out.print(2+" ");
				else if(i==3 && j==3)System.out.print(3+" ");
				else System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
