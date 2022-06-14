package edurekaThread;

class Tasks implements Runnable {

	@Override
	public void run() {
		// set the name of the thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MultiThreadRunnable2 {

	public static void main(String[] args) {

		System.out.println("Starting thread 1"); // Thread 0
		Thread t1 = new Thread(new Runnable() { // anther way write runnable with anonymous runnable
			@Override
			public void run() {
				// set the name of the thread
				for (int i = 0; i < 10; i++) {
					System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		t1.start();

		System.out.println("Starting thread 2"); // Thread 1
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// set the name of the thread
				for (int i = 0; i < 10; i++) {
					System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		});

		t2.start();

	}
}
