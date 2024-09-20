package Programs;

/*
 * Posible only in multiple classes(Inheritance)
 * We should not change the signature of the method but body we should change
 * method names shoule be same
 * Overrinding concept belongs to Inheritance
 */


class Bank{
	
	double roi() { return 0; }
}

class ICICI extends Bank{
	
	double roi() { return 10.5; }	
}

class SBI extends Bank {
	
	double roi() { return 12.5; }
}



public class MethodOverriding {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		System.out.println(ic.roi());

	}

}
