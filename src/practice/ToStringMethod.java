package practice;

class Student{
	
	int rollNo;
	String studentName;
	
	public Student(int rollNo, String studentName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	
	
	
}


public class ToStringMethod {

	public static void main(String[] args) {
		
		Student std = new Student(1,"Netra");
		System.out.println(std);
		 
	}

}
