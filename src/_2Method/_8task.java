package _2Method;

public class _8task {

	public int average(int a,int b,int c) {
		int d=(a+b+c)/3;
		return d;
	}
	public  void Square () {
		int f= average(10,10,10);
		System.out.println(f*f);
	}
	public static void main(String[] args) {

		_8task ref=new _8task();
		ref.Square();
		
	}

}
