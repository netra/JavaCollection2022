package comparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoArraySort {

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
		
		System.out.println("List before sort "+list);
		
		Collections.sort(list);  // collection.sort for sorting collection
		System.out.println("List after Sort "+list);
		
		Collections.sort(list,Collections.reverseOrder());  // reverse order sort
		System.out.println("List after Sort "+list);

		
	}

}
