package _15Threads;

public class _1stT extends Thread {

	@Override
	public void run() {
		try {
		for (int i = 1; i <=3; i++) {
			System.out.println("Run method of _1st thread class...");
			
				sleep(1000);
		}
			}
		catch (Exception e) {
				
			}
			}
}
