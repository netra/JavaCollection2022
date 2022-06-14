package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorApp {

	public static void main(String[] args) {
		 List<Integer> list1 = new ArrayList<>();
		 List<String> list2 = new LinkedList<String>();
		 
		 list1.add(22);
		 list1.add(5);
		 list1.add(17);
		 list1.add(11);
		 
		 list2.add("Nia");
		 list2.add("Rishab");
		 list2.add("Eshan");
		 list2.add("Aryan");
		   
		 // using iterator
		 
		 Iterator<Integer> itr1 = list1.iterator();
		 //System.out.println( itr1.next()); 
		  
//		 System.out.println( itr1.next());
//		 System.out.println( itr1.next());
		 System.out.println("Iterator List");
		 System.out.println(list1 );
		 
//		 System.out.println("List with Iterator");
//         while(itr1.hasNext()) {
//        	 System.out.println(itr1.next());
//         }
         System.out.println("Iterator list  remove");
         while(itr1.hasNext()) {
        	 if(itr1.next()<10) {
        		 itr1.remove();
        	 }
         }
         System.out.println("Iterator List after remove");
         
            System.out.println(list1 );
            	 
         
         
		 
		  
		 
	}

}
