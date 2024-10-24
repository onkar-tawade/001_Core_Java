package _1programStart;

public class _14starp6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				
				
				if(i==3 && j==3)System.out.print("@ ");			
				else if(i==j)System.out.print("# ");
       			else if(i==i && j==(5-i)+1)	System.out.print("! ");
				else 					System.out.print("  ");


			}
			System.out.print("\n");

		}
	}

}
