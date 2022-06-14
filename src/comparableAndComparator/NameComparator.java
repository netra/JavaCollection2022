package comparableAndComparator;

import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Employee>   {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName()); // ascending order or natural order
		//return o2.getName().compareTo(o1.getName());   // descending order
	}

}
