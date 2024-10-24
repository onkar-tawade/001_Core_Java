package _2Method;

public class _4SumDigit {

	public int DigitsSum(int num) {
		int sum=0;int digit=0;
		while(num>0) {
			digit=num%10;
			num=num/10;//0
			sum=sum+digit;
		}
		return sum;
		
	}
	public static void main(String[] args) {

		_4SumDigit ref=new _4SumDigit() ;
		int n= ref.DigitsSum(153);
		System.out.println(n);
		
	}

}
