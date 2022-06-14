package edurekaThread;

//youtube multhithreading part2 imtiaz ahmad 

class Task2 extends Thread {
	
	String name;
	
	public Task2(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		// set the name of the thread
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 5; i++) {
			System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MultiThreadSetThreadName {

	public static void main(String[] args) {

		System.out.println("Starting thread 1"); // Thread 0
		Task2 task = new Task2("Thread-A");
		task.start();

		System.out.println("Starting thread 2"); // Thread 1
		Task2 task1 = new Task2("Thread-B");
		task1.start();

	}

}
