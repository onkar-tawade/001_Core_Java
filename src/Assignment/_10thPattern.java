package Assignment;

public class _10thPattern {

	public static void main(String[] args) {
/*
		1 1 1 1 1 
		1 2 2 2 1 
		1 2 3 2 1 
		1 2 2 2 1 
		1 1 1 1 1            */
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||j==1||i==5||j==5) {
					System.out.print(1+" ");
				}
				else if(i==3 && j==3) System.out.print(3+" ");
				else System.out.print(2+" ");
				
			}
			System.out.println();

		}
		System.out.println(".......................................................");
		/*
		@ @ @ @ @ 
		@ # # # @ 
		@ # * # @ 
		@ # # # @ 
		@ @ @ @ @     */
		char a,b;
		for(a=1;a<=5;a++) {
			for(b=1;b<=5;b++) {
				if(a==1 || b==1 ||a==5 ||b==5) {
					System.out.print("@ ");
				}
				else if(a==3 && b==3)System.out.print("* ");
				else System.out.print("# ");
			}
			System.out.println();
		}
	}

}
