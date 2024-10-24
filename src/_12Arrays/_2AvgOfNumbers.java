package _12Arrays;

public class _2AvgOfNumbers {

	public static void main(String[] args) {

		int n[]= {2,4,12,20,22};
		int sum=0;
		for (int b:n) {
			sum=sum+b;
		}
		double avg=(sum/n.length);
		System.out.println("Average of numbers is:"+avg);
	}

}
