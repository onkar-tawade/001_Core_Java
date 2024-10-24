package _2Method;

public class _9SumOfNum {

	public int SumNum(int n) {
		return (n*(n+1))/2;
	}
	public static void main(String[] args) {		

		_9SumOfNum ref=new _9SumOfNum();
		int j=ref.SumNum(10);
		System.out.println(j);
	}

}
