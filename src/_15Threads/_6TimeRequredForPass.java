package _15Threads;

public class _6TimeRequredForPass extends Thread {
	int i;
	static int count=0;

	@Override
	public void run() {
		
		try {
			for ( i = 0; i <=i; i++) {
				sleep(1000);
				count++;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void display() {
		show(count);
	}
	

	
	public static void show(int num) {
		System.out.println("Required time is "+num+" second.");
	}

}
