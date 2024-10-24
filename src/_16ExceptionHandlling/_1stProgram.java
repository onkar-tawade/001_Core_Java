package _16ExceptionHandlling;

public class _1stProgram {

	public static void main(String[] args) {

		String str="Onkarsd fe";
		
		try {        /////.....Risky code written in this block....
			
//			System.out.println(str.charAt(25));
			
			for (int i = 0; i <=25; i++) {
				
				System.out.println(str.charAt(i));
			}
		} 
		catch (Exception e) {  ///// .....Catch block is the backup block.....back-up code written in this block..
			                              //// ..if try execute then catch does not and vice-versa
              System.out.println(e.getMessage());
		}
		
		finally {           //// ...Finally block always execute...
			System.out.println("This finally block  always execute.....");
		}
	}

}
