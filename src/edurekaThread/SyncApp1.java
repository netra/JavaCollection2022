package edurekaThread;

class Printer1{
	//synchronized void printDocument1(int numOfCopies, String docName) {    // 2. way to make synchronized from method
	void printDocument1(int numOfCopies, String docName) {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	
	Printer1 pRef1;
	
	MyThread(Printer1 p1){
		this.pRef1=p1;
	}
	
	@Override
	public void run() {
		synchronized (pRef1) {        // 3. way to make synchronized on block
			pRef1.printDocument1(10,"Aryan'sProfile.pdf");
		}
	}
}

class YourThread extends Thread{
	
	Printer1 pRef1;
	
	YourThread(Printer1 p1){
		pRef1=p1;
	}
	
	@Override
	public void run() {
		pRef1.printDocument1(10,"Eshan'sProfile.pdf");
	
	}
}

public class SyncApp1 {

	// main is representing main thread
	public static void main(String[] args) {
		
		System.out.println("--Application strted-- ");
		
		// we have only 1 single object of Printer
		Printer1 printer1 = new Printer1();
		//printer1.printDocument1(10,"Amit'sProfile.pdf");
		
		//Scenario is that we have multiple thread working on the same Printer Object
		// If multiple Thread are going to work on the same single Object we must synchronize them
		MyThread thread = new MyThread(printer1);  // MyThread is having reference to the Printer
		YourThread yThread = new YourThread(printer1); // YourThread is having reference to the Printer
		thread.start();
		/*try {                                
			thread.join();           // 1. way to make synchronized
		} catch (InterruptedException e) {    // Instead of join() method for synchronize we can also use 
			e.printStackTrace();            // synchronized word for method, so all thread can use
		}*/                                 // synchronized word for block, on run method
		yThread.start();
		
		System.out.println("--Application Finished-- ");
		
	}

}
