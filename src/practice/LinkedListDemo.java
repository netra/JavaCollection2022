package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.push("Netra");
		list.push("Amit");
		list.push("Eshan");
		list.push("Nia");
		list.push("Aryan");
		list.push("Rishab");
		
		// remove element from list with pop(), removeFirst() & remove()
		System.out.println("LinkedList : "+list);
		System.out.println(list.pop());
		//System.out.println(list.removeFirst());
		//System.out.println(list.remove());
		System.out.println("LinkedList after pop : "+list);
		
		// using iterator
		System.out.println("====Iterating with Iterator====");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		// we add to list
		list.add(3,"Rashmi");
		System.out.println("LinkedList after adding : ");
		for(String s: list) {
			System.out.println(s);
		}
		
	}

}
