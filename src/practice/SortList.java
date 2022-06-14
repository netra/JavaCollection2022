package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import comparableAndComparator.Employee;

public class SortList {

	public static void main(String[] args) {
		int []arr = {22, 14, 5, 56,87,2,45};
		Arrays.sort(arr); // to sort primitive type we use Arrays.sort
		//System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<>();
		
		list.add("Netra");
		list.add("Amit");
		list.add("Eshan");
		list.add("Nia");
		list.add("Aryan");
		list.add("Rishab");
		
		//System.out.println("List before sort "+list);
		Collections.sort(list);  // collection.sort for sorting collection
		//System.out.println("List after Sort "+list);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(3,"Sam",11000));
		empList.add(new Employee(1, "Nia",9000));
		empList.add(new Employee(5,"Kate",5000));
		empList.add(new Employee(4,"Andy",2000));
		empList.add(new Employee(2,"Ella",3000));
		
		
		Collections.sort(empList,Collections.reverseOrder());  // 1. collection sort with comparable
		for(Employee emp:empList) {
			System.out.println(emp.id+" "+emp.name+" "+emp.salary);
		}
		System.out.println("List after Sort "+ empList);

	}

}
