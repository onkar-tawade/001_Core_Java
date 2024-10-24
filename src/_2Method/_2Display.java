package _2Method;

public class _2Display {
	public void Display(String name,double bankb,String accno) {
		System.out.println("Name is:"+name);
		System.out.println("Bank balance is:"+bankb);
		System.out.println("Account no. is:"+accno);


	}

	public static void main(String[] args) {

		_2Display ref=new _2Display();
		 ref.Display("Omkar", 50000.56, "MH07123456789");
		
	}

}
