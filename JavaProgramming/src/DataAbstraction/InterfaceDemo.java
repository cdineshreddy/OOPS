package DataAbstraction;


/*
 * An interface is a blue print of class.
 * Interface contains final & static variables.
 * Interface contains abstract methods (also allowed default methods & static methods from java8 onwards).
 * An abstract method is a method contains signature but no body(Un implemented method).
 * Methods in interface are public.
 * Interface supports the functionality of multiple inheritance.
 * We can define interface with interface keyword.
 * A class extends another class, an interface extends another interface but a class implements an interface.
 * We can create object refernce for interface but we cannot instantiate/create interface.
 */

interface Shape{
	
	final static int length =10; // By default final and static 
	int width = 20;
	
	void circle(); //abstract method
	
	// below methods are available from java 8
	default void square() { System.out.println("This is sqaure - default method...."); }
	static void rectangle() { System.out.println("This is rectangle - static method"); }
	
}

public class InterfaceDemo implements Shape {
	
	public void circle() { System.out.println("this is circle - abstract method"); }
	void traingle() { System.out.println("this is triangle"); }

	public static void main(String[] args) {
		
		//Scenario 1
		InterfaceDemo demo = new InterfaceDemo();
		demo.circle();
		demo.square();
		Shape.rectangle();
		demo.traingle();
		
		System.out.println(Shape.length+Shape.width);
		
		//Scenario 2
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
		
	}

}
