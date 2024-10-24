package _4Inheritance.simple;

public class Civil extends Department {
	public String sub="XYZ";
	public  void Display() {
		Show();
		
		setHODName("Aalve");
		System.out.println("Name of HOD is:"+getHODName());
		System.out.println("Subject of CS department is:"+sub);

	}
	
	public static void main(String[] args) {
		Civil ref=new Civil();
		ref.Display();
		
	}
}
