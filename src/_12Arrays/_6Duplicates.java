package _12Arrays;

public class _6Duplicates {

	public static void main(String[] args) {

		int num[]= {10,20,30,10,12,14,20};
		int count=0;
		int n=100;
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]==n) {
				count++;
			}
		}
		if(count!=0)System.out.println(n+" repeates "+count+" times.");
		else System.out.println(n+" not repeate.");
	}

}
