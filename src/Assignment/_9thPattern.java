package Assignment;

public class _9thPattern {

	public static void main(String[] args) {
/*
		1
		11
		121
		1331
		14641                */
		
//		for(int i=0;i<5;i++) {
//			int j=(int)Math.pow(11, i);
//			System.out.println(j);
//		}
		
		
		for(int i=4;i>=0;i--) {
			int j=(int)Math.pow(11, i);
			System.out.println(j);
		}
	}

}
