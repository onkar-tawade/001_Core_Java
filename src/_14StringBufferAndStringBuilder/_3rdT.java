package _14StringBufferAndStringBuilder;

public class _3rdT extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			System.out.println("Run method of _3rd thread class...");
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
