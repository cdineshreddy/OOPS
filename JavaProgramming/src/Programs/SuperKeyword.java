package Programs;

/*
 * Super keyword  will be used to invoke the immediate parent class variable
 * Super keyword  will be used to invoke the immediate parent class method
 * Super keyword  will be used to invoke the immediate parent class constructor
 */

class Animal {
	
	String color = "white";
	void eat() { System.out.println("Eating....");	}
	
	Animal(){System.out.println("this is an animal"); }
}

class Dog extends Animal {
	
	String color = "black";
	
	void displayColor() {
		System.out.println(super.color); //white
		System.out.println(color); // black
	}
	
	void eat() { 
		System.out.println("Eating Bread");	
		super.eat();
	}
	
	Dog() {
		super(); // invoke parent class constructor
		//System.out.println("This is an dog");
		}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.displayColor();
		d.eat();
		

	}

}
