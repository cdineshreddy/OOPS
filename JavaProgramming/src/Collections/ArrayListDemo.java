package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//Collection - To represent group of elements/objects/data into single entity
//Collection is an interface available in java.util

/*
 * ArrayList is class which is implemented list interface
 * Hetrogenious data is allowed
 * Insertion Order preserved(Index)
 * Duplicate elements allowed
 * Multiple null vallues allowed
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		 ArrayList<Object> al = new ArrayList<Object>();
		 
		 //Adding the elements
		 al.add("Hello");
		 al.add(100);
		 al.add(10.5);
		 al.add(true);
		 al.add(null);
		 al.add(100);
		 
		 System.out.println(al.size());
		 System.out.println("Printing data from arraylist: "+al);
		 
		 //Remove element from arraylist
		 al.remove(4);
		 System.out.println("After removing:" +al);
		 
		 //Insert element in the arraylist
		 al.add(2,"Java");
		 System.out.println("After inserting:" +al);
		 
		 //Modify/Update element in the arraylist
		 al.set(2, "Selenium");
		 System.out.println("After updation:" +al);
		 
		 //Access specific element from arraylist
		 System.out.println(al.get(3));
		 
		 //Reading all the elements from arraylist
		 //Using normal for loop		 
		 for(int i=0;i<al.size();i++) 
			 System.out.println(al.get(i));
		 
		 
		 //Using for... each loop
		 System.out.println("Printing the arraylist using for each loop");
		 for(Object list:al)
			 System.out.println(list);
		 
		 //Using iterator
		 System.out.println("Printing the arraylist using iterator");
			Iterator<Object> it=al.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			}
		
		//Checking the arraylist is empty or not
			System.out.println("Is arraylist empty?:" +al.isEmpty());
			
		//Remove all the elements from arraylist
			al.clear();
			System.out.println("After removing all the elements in arraylist");
			System.out.println("Is arraylist empty?:" +al.isEmpty());
	}

}
