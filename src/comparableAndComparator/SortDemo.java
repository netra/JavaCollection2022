package comparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {

		// 1. Array sort
		int[] arr = { 22, 14, 5, 56, 87, 2, 45 };
		Arrays.sort(arr); // to sort primitive type we use Arrays.sort
		System.out.println(Arrays.toString(arr));

		// 2. collection with primitive data sort
		List<String> list = new ArrayList<>();
		list.add("Netra");
		list.add("Amit");
		list.add("Eshan");
		list.add("Nia");
		list.add("Aryan");
		list.add("Rishab");

		System.out.println("List before sort " + list);

		Collections.sort(list); // collection.sort for sorting collection
		System.out.println("List after Sort " + list);

		Collections.sort(list, Collections.reverseOrder()); // reverse order sort
		System.out.println("List after Sort " + list);

		// 3. Collection with Object sort
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(12, "khan", 41200));
		empList.add(new Employee(18, "man", 51200));
		empList.add(new Employee(21, "dan", 10200));
		empList.add(new Employee(2, "adam", 61200));
		empList.add(new Employee(10, "sam", 13200));

		System.out.println("\nSort Collection Object with comparable");
		Collections.sort(empList);
		System.out.println(empList);

		// Sort Comparator with static method
		System.out.println("\nSort Collection Object with Comparator Static Method");
		Collections.sort(empList, Employee.idComparator);
		System.out.println(empList);

		// Sort Comparator with class implementation
		System.out.println("\nSort Collection Object with Comparator class implementation");
		Collections.sort(empList,  new NameComparator());
		System.out.println(empList);

	}

}
