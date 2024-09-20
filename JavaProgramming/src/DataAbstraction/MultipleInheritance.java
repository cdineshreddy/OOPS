package DataAbstraction;


public class MultipleInheritance implements Interface1,Interface2{
	
	public void m1() { System.out.println("This is m1..."); }
	public void m2() { System.out.println("This is m2..."); }
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
		mi.m2();
		
		
		System.out.println(mi.x); // this is not the right way to call the static variables
		System.out.println(mi.y);

	}

}
