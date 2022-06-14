package edurekaThread;

// Thread with Runnable interface   

//If class already extended other class then we can't extend multiple class, then we use runnable
//class MyTask extends MyWork implements Runnable
class MyMy {

}

class MyJob extends MyMy implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int sum = i + 1;
			System.out.println("$$ Printing number : " + sum + " printer 1");
		}
	}

}
class YourJob extends MyMy implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int sum = i + 1;
			System.out.println("`` Printing number : " + sum + " printer 3");
		}
	}

}

public class App2 {
	public static void main(String[] args) {
		// whatever we write in here will be executed by main thread
		// Threads always execute the jobs in a sequence
		// Execution context

		// Job 1
		System.out.println("Application strted ");

		// Job 2
		Runnable r = new MyJob();
		Thread task = new Thread(r);
		task.start();
		
		Thread job = new Thread(new YourJob());
		job.start();
		//new Thread(new YourJob()).job.start(); also can written like this
		
		// Job 3
		for (int i = 0; i < 10; i++) {
			int sum = i + 1;
			System.out.println("^^ Printing number : #" + sum + " printer 2");
		}
		
		// Job 4
		System.out.println("Application Finished ");

	}

}
