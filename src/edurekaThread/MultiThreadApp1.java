package edurekaThread;

//youtube multhithreading part2 imtiaz ahmad 

class Task1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Number :  " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class MultiThreadApp1 {

	public static void main(String[] args) {

		System.out.println("Starting thread 1"); // Thread 0
		Task1 task = new Task1();
		task.start();

		System.out.println("Starting thread 2"); // Thread 1
		Task1 task1 = new Task1();
		task1.start();

	}

}
