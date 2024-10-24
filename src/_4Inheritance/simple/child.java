package _4Inheritance.simple;

public class child extends Parent {

	String name="Omkar";
	String degreee="Bsc.IT";
	public void PrintInfo() {
		setSurname("Tawade");
		String n=getSurname();
	System.out.println("Name is:"+name+"\n"+"Surname is:"+n+"\n"+"Education is:"+degreee+"\n"+"Bussiness of:"+Bussiness+"\n"+"Vehical is:"+vehical);
	}
	public static void main(String[] args) {

		child ref=new child();
		ref.PrintInfo();
		

		
	}

}
