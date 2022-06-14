package edurekaThread;

// Main Thread with multiple task, 
//Threads always execute the jobs in a sequence
// Execution context, job1 , job2 then job3


class MyTask {
	public void excuteTask() {
		for (int i = 0; i < 10; i++) {
			int sum = i + 1;
			System.out.println("Printing number : " + sum + " printer 2");
		}
	}
}

public class App {

	// main method represents main thread
	public static void main(String[] args) {
		// whatever we write in here will be executed by main thread
		// Threads always execute the jobs in a sequence
		// Execution context

		// Job 1
		System.out.println("Application strted ");

		// Job 2
		MyTask task = new MyTask();
		task.excuteTask();

		// Till Job2 is not finished, below written job are waiting and not executed
		// In case job2 is a long running operation
		// In such case OS?JVM shall give a msg app is not responding
		// Some sluggish behavior in app can be observed -> App seems to hang

		// Job 3
		for (int i = 0; i < 10; i++) {
			int sum = i + 1;
			System.out.println("^^ Printing number : #" + sum + " printer 1");
		}
		// Job 4
		System.out.println("Application Finished ");

	}

}
