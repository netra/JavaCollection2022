package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	
	String name;
	int id;
	char grade;
	
	public Student(String name, int id, char grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	
	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student("Sam", 25, 'B'));
		stdList.add(new Student("Zen",11,'C'));
		stdList.add(new Student("Jack",5,'A'));
		stdList.add(new Student("Pan",32,'D'));
		stdList.add(new Student("Adam",2,'E'));
		
		//System.out.println("List before Sort "+ stdList);
		Collections.sort(stdList, new NameSortStudent());
		for(Student std:stdList) {
			System.out.println(std.name+" "+std.id+" "+std.grade);
		}
		System.out.println("List after Sort "+ stdList);
		
	}

}
