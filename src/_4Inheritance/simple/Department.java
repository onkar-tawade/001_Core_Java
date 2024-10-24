package _4Inheritance.simple;

public class Department extends College{

	private String HODname;
	
	public String getHODName() {
		return HODname;
	}
	public void setHODName(String h) {
		HODname=h;
	}
	
	public  void Show() {
		System.out.println("Name of college is:" +clgName);
		System.out.println("Code of college is:"+clgCode);
		System.out.println("Name of college is:"+clgAddress);
	}
}
