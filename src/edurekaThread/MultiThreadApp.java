package edurekaThread;

//youtube multhithreading part1 imtiaz ahmad 

class Task extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Number :  " + i);
		}
		
	}
	
}

public class MultiThreadApp {

	public static void main(String[] args) {
		
		// In multi-threading threads run concurrently, so hello come before number
		 Task task = new Task();
		 task.start();
		 System.out.println("Hellow there");
		 
		 // it's Illegal to start thread more than once, like task.start();
		 // but can create new instance if we want to use loop again
		 
		 Task task1 = new Task();
		 task1.start();
		 
	}

}
