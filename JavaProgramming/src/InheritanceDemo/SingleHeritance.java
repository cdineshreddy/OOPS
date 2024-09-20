package InheritanceDemo;

/*
 * Inheritance -> Acquring all the properties(variables) and behaviour(Methods) from one class to another class
 * Objective -> 1. Re-usuability 2. Avoid duplication * 
 * Types -> 1. Single 2. Multi-level 3. hierarcy 4. multiple 5. hybrid
 * 
 */

class A {
	
	int a;
	void display() { System.out.println(a); }
}

class B extends A{
	
	int b;
	void show() { System.out.println(b); }
	
}

public class SingleHeritance {	

	public static void main(String[] args) {
		
		B bObj = new B();
		bObj.b=10;
		bObj.a=20;
		
		bObj.display();
		bObj.show();	

	}

}
