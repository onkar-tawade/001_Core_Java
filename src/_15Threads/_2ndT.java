package _15Threads;

public class _2ndT extends Thread{

	@Override
	public void run() {
	
		for (int i = 1; i <=3; i++) {
			System.out.println("Run method of _2nd thread class...");
			try {
				sleep(1000);
			} catch (Exception e) {

			
			}
		}
	}
}
