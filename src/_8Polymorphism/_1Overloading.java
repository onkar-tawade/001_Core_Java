package _8Polymorphism;

public class _1Overloading {

	public static void bookTickets() {
		System.out.println("You only book 1 Silver ticket");
	}
	public static void bookTickets(int num) {
		System.out.println("You book "+num+ " Silver tickets");
	}
	public static void bookTickets(String variety) {
		System.out.println("You only book 1 "+variety+" ticket");
	}
	public static void bookTickets(String name,int num,String variety) {
		System.out.println(name+" , you book "+num+" "+variety+" tickets");
	}
	
	public static void main(String[] args) {

		bookTickets("Omkar",2,"Diamond");
		
	}

}
