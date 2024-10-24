package _2Method;

public class _10Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int rev=0;
		int k=num;

		while (num>0) {
			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);

//		if(k==rev) {
//			System.out.println("Palindrome");
//		}
	}
}