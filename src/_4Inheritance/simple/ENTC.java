package _4Inheritance.simple;

public class ENTC extends Department{

	public String sub="E&C";
	public  void Display() {
	
		Show();
		
		setHODName("Kubal");
		System.out.println("Name of HOD is:"+getHODName());
		System.out.println("Subject of CS department is:"+sub);

	}
	
	public static void main(String[] args) {
		ENTC ref=new ENTC();
		ref.Display();
		
	}
}
