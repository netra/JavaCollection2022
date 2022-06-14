package edurekaCollectionJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		Set<String> set= new TreeSet<String>(); // data is unordered but alphabetically sorted
		
		// Here dat is not added as in indexing approach.
		// we got hashCodes for elements which are being added
		set.add("Netra");
		set.add("Amit");
		set.add("Eshan");
		set.add("Nia");
		set.add("Eshan");
		set.add("Aryan");
		set.add("Eshan");
		set.add("Rishab");
		
		// 1. Data is Unique, no Redundancy
		// 2. Data is unordered in output due to hashing
		System.out.println("Set is : "+set);
		
		System.out.println("====Iterating with Iterator====");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {      // to read all the element with iterator using loop
			 String str =itr.next();
			 System.out.println(str);
		}
		System.out.println("Set size is  : "+set.size());
		set.remove("Nia");
		System.out.println("Set after removing Nia is :  " + set);
		if(set.contains("Netra")){
			System.out.println("Netra is in the set"+set);
		}
		System.out.println("Set size is after remove: "+set.size());
	}

}
