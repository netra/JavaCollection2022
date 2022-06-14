package edurekaCollectionJava;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int roll;
}

public class ListDemo {

	public static void main(String[] args) {
		
		// list1 can only store String objects, its type specific
		 ArrayList<String> list1= new ArrayList<String>();
		 
		 // list2 can store any type of object, any type of data
		 ArrayList list2 = new ArrayList();
		 
		 Student s1 = new Student();
		 s1.name = "Netra";
		 s1.roll = 123;
		 
		 //1. Add Data in list
		 list1.add("Netra");
		 list1.add("Amit");
		 list1.add("Eshan");
		 list1.add("Nia");
		 list1.add("Aryan");
		 list1.add("Rishab");
		 
		 //with any data type
		 list2.add("Netra");
		 list2.add(10);
		 list2.add(2.2);
		 list2.add(true);
		 list2.add(s1.name);
		 
		 //Print reference to list
		 System.out.println("List 1 is "+list1);
		 System.out.println("List 2 is "+list2);
		 
		 //2. Get the element from the list
		 String name = list1.get(4);
		 System.out.println("Name is : "+name);
		 
		 Object o =list2.get(3); // Object is parent of any type in Java.
		 //As per polymorphism parent can  point to any object
		 System.out.println("O is : "+o);
		 
		 //3. Update Element in list
		 list1.set(3, "Ria");
		 System.out.println("List 1 now is : "+list1);
		 
		 //4. Remove element from list
		 list1.remove(3);
		 System.out.println("List 1 now is : "+list1);
		 
		 //list1.clear(); -> Remove all
		 
		 //5. Searching and Contain in list
		 if(list1.contains("Eshan")) {
			 System.out.println("Eshan is in the list 1");
		 }
		 
		 //6. Iterate in ArrayList
		 System.out.println("====List 1 Iterating with Enhanced For Loop====");
		 for(String str : list1) {
			 System.out.println(str);
		 }
		 System.out.println("=========");
		 System.out.println("====List 2 Iterating with Enhanced For Loop====");
		 for(Object oo : list2) {
			 System.out.println(oo);
		 }
		 System.out.println("=========");
		 
		 System.out.println("====Iterating with For Loop====");
		 for(int i=0; i<list2.size(); i++) {
			 System.out.println(list2.get(i));
		 }
		 System.out.println("=========");
		 
		 System.out.println("====Iterating with Iterator====");
		 Iterator<String> itr = list1.iterator();
		 System.out.println(itr.next());// 	iterator is going give the element one by one
		 System.out.println(itr.next());
		 System.out.println("=========");
		 
		 while(itr.hasNext()) {      // to read all the element with iterator using loop
			 String str =itr.next();
			 System.out.println(str);
			 if(str.equals("Rishab")) {  // to remove
				 itr.remove();
			 }
		 }
		 System.out.println("List1 after iteration is : " +list1);
		 


	}

}
