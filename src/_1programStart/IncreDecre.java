package _1programStart;

public class IncreDecre {

	public static void main(String[] args) {
		int m=10;
		System.out.println("Before: "+ m);
		System.out.println(m);
		System.out.println("On Post: "+ m--);
		System.out.println("After Post: "+m);
		System.out.println(m);
		int r= 3;
		int a=r++;
		int b=--r;
		System.out.println(a-b);

		// 128 64 32 16 8 4 2 1
	//45-	0  0  1  0  1 1 0 1
	//54    0  0  1  1  0 1 1 0	
	/*
	 * int a=3; a++; System.out.println(a++ - --a);
	 */


	}

}