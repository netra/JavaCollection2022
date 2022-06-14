package edurekaThread;

class Printer{
	void printDocument(int numOfCopies, String docName) {
		for(int i=0; i<numOfCopies; i++) {
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

public class SyncApp {

	public static void main(String[] args) {
		
		System.out.println("--Application strted-- ");
		
		Printer printer = new Printer();
		printer.printDocument(15,"Netra'sProfile.pdf");
		
		System.out.println("--Application Finished-- ");
		
	}

}
