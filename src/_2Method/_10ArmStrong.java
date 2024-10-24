package _2Method;

public class _10ArmStrong {

	public static void main(String[] args) {

		int n=153;
		int k=n;
		int cube=0;
	
		while(n>0) {
			int temp=(int)Math.pow(n%10, 3);
			cube=cube+temp;
			n=n/10;
		}
		if(k==cube)System.out.println(k+" is Armstring number");
		else System.out.println(k+" is Not an Armstrong number");
	}

}
