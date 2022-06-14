package comparableAndComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	 int id;
	 String name;
	 int salary;
	
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}


	@Override
	public int compareTo(Employee o) {
		return this.salary - o.getSalary();
		//return this.id - o.getId();
	}
	
	public static  Comparator<Employee> idComparator = new Comparator<Employee>(){
		
		public int compare(Employee e1, Employee e2) {
			return e1.getId() -e2.getId();
		}
	};
	
	public String toString() {
		return "Employee [id = " + id +",Name = " +name +", Salary = " + salary + "]";
	}

}

