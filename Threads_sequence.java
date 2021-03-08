package codility_1;

public class Threads_sequence implements Runnable{

	public static void main(String[] args) {
		Runnable r = new Threads_sequence();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

}
