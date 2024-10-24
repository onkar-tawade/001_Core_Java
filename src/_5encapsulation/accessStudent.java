package _5encapsulation;

public class accessStudent {

	public static void main(String[] args) {

		Student ref=new Student();
		
		//////Here set the parameter
		ref.setName("Omkar");
		ref.setAddress("Sindhudurg");
		ref.setRollno(64);
		ref.setID(123456);  
		
		//////Here get the parameter
//        String name=ref.getName();
//		String address=ref.getAddress();
//		int rollno=ref.getRollno();
//		int id=ref.getID();
		
/////here we use show method so it is not mendatory to get the values.....
		ref.show();
				/////For every student it is compulsory to make another object.....
		Student reff=new Student();
		reff.setName("Pari");
		reff.setAddress("Sindhudurg");
		reff.setRollno(2621);
		reff.setID(12345678);  
		
		reff.show();
	}

}
