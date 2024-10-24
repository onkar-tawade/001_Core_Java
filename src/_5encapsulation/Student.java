package _5encapsulation;

public class Student {
	
	private String name,address;
	private int id,rollno;
	////Getter and Setter for name
	public void setName(String n){
		name=n;
	}
	public String getName() {
		return name; 
	}
	////Getter and Setter for Address
	public void setAddress(String s){
		address=s;
	}
	public String getAddress(){
		return address;
	}
	
	////Getter and Setter for id
	public void setID(int i){
		id=i;
	}
	public int getID() {
		return id;
	}
	
	
	////Getter and Setter for rollno
	public void setRollno(int r){
		rollno=r;
	}
	public int getRollno() {
		return rollno;
	}
	
	public void show() {
		System.out.println("Student name is:"+name+"\n"+"Student address is:"+address+"\n"+"Student's ID is:"+id+"\n"+"student's Rollno is:"+rollno+"\n");
	}
}


