package Programs;

/*
 * Auto Boxing - primitive type to Object type
 * un boxing - Object type to Primitive type
 */

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//Primitive data type
		int i =10; 
		double d = 10.59;
		char c ='A';
		boolean b = true;
		
		//Converting primitive data type to object type - Auto boxing
		Integer iobj = i; 
		Double  dobj = d;
		Character cobj = c;
		Boolean bobj = b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//Converting objects to primitive types - un boxing
		int ivalue = iobj;
		double dvalue = dobj;
		char cvalue = cobj;
		boolean bvalue = bobj;
		
		System.out.println(ivalue);
		System.out.println(dvalue);
		System.out.println(cvalue);
		System.out.println(bvalue);

	}

}
