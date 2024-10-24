package _4Inheritance.simple;

public class ComSc extends Department{

	public String sub="Java";
	public  void Display() {
		
		Show();
		setHODName("Karalkar");
		System.out.println("Name of HOD is:"+getHODName());
		System.out.println("Subject of CS department is:"+sub);

	}
	
	public static void main(String[] args) {
		ComSc ref=new ComSc();
		ref.Display();
		
	}
}
