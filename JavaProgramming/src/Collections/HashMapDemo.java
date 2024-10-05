package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * HashMap - a class implemented Map interafce
 * Data can be strored in the form of key, value pair
 * Key is unique. But we can have duplicate values
 * Insertion order not preserved
 * 
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		Map<Integer,Object> m = new HashMap<Integer,Object>();
		
		m.put(101, "Dinesh");
		m.put(102, "Reddy");
		m.put(102, "Ramesh");
		m.put(103, "Suresh");
		m.put(104, "Dinesh");
		
		System.out.println(m); //{101=Dinesh, 102=Ramesh, 103=Suresh, 104=Dinesh}
		System.out.println("Size of hashmap:" +m.size());
		
		//Remove one pair
		m.remove(103);
		System.out.println("After removing pair:"+m);
		
		//Access value of the key
		System.out.println(m.get(102));
		
		//Get all the keys from hashmap
		System.out.println(m.keySet()); //[101, 102, 104]
		System.out.println(m.values()); //[Dinesh, Ramesh, Dinesh]
		System.out.println(m.entrySet()); //[101=Dinesh, 102=Ramesh, 104=Dinesh]
		
		//Reading data from hashmap
		//using for... each
		
		for(int k:m.keySet())
			System.out.println(k+"   "+m.get(k));
		
		//using iterator
		Iterator<Entry<Integer,Object>> it=m.entrySet().iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Entry<Integer,Object> entry = it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		m.clear();
		System.out.println(m.isEmpty());
	}

}
