package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorApp {

	public static void main(String[] args) {
		List<String> list2 = new LinkedList<String>();

		list2.add("Nia");
		list2.add("Rishab");
		list2.add("Eshan");
		list2.add("Aryan");

		ListIterator<String> itr = list2.listIterator();
		System.out.println("List : "+list2);

		System.out.println("Traversing the list in forward direction : hasNext ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing the list in backward direction : hasPrevious ");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		// adding with listIterator
		itr.add("Netra");
		itr.add("Amit");
		itr.add("Netra");
		
		System.out.println("After adding : "+list2);
		
		// 
		ListIterator<String> itr1 = list2.listIterator(4);
		System.out.println("\nUsing ListIterator" + " printing list from Index 4");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		 
	}

}
