package Programs;


/*
 * Upcasting - converting value from smaller to larger
 * Downcasting - converting value from larger to smaller
 */
public class TypeCasting {

	public static void main(String[] args) {
	
		//upcasting(automatic) - smaller to larger
		int value = 100;
		long longValue = value;
		System.out.println(longValue);
		
		float f = 10.5F;
		double dvalue = f;
		System.out.println(dvalue);
		
		//downcasting(manually) - larger to smaller
		long lvalue = 10000;
		int ivalue = (int)lvalue;
		System.out.println(ivalue);
		
		
		
	}

}
