package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * HashSet - a class implemented Set interface
 * Heterobenious data is allowed
 * Insertion order is not preserved(No index)
 * Duplicated elements is not allowed
 * Multiple elements are not allowed
 * Only single null is allowed
 */
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<Object>();
		s.add(100);
		s.add(10.19);
		s.add(true);
		s.add("Hello");
		s.add(null);
		s.add(null);
		s.add(100);
		
		System.out.println(s); //[null, 100, Hello, 10.19, true]
		
		//Remove element
		s.remove(true);
		System.out.println("After Removing:" +s);
		
		//Inserting element is not possible
		//Access specific element is not possible
		
		//Convert HashSet to ArrayList
		ArrayList<Object> al = new ArrayList<Object>(s);
		System.out.println(al.get(2));
	}

}
