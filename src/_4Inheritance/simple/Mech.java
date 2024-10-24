package _4Inheritance.simple;

public class Mech extends Department{
	public String sub="TOM";
	public  void Display() {
		Show();
		
		setHODName("Sawant");
		System.out.println("Name of HOD is:"+getHODName());
		System.out.println("Subject of CS department is:"+sub);

	}
	
	public static void main(String[] args) {
		Mech ref=new Mech();
		ref.Display();
		
	}
}
