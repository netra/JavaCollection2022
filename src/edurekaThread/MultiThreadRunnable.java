package edurekaThread;

class Task3 implements Runnable {
	
	
	@Override
	public void run() {
		// set the name of the thread
		for (int i = 0; i < 100; i++) {
			System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MultiThreadRunnable {

	public static void main(String[] args) {
		System.out.println("Starting thread 1"); // Thread 0
		Thread task = new Thread(new Task3()) ;
		task.start();

		System.out.println("Starting thread 2"); // Thread 1
		Thread task1 = new Thread(new Task3());
		task1.start();

	}
	}


