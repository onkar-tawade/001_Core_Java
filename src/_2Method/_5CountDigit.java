package _2Method;

public class _5CountDigit {

	public int Count(int num) {
		int count=0;
		while(num>0) {
		num=num/10;
		count++;
		}
		return count;
	}
	public static void main(String[] args) {
   _5CountDigit ref=new _5CountDigit();
   int n=ref.Count(45);
 System.out.println("Count is:"+n);


		
	}

}
