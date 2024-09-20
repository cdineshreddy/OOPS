package Programs;

/*
 *We can achieve through creating same method with different parameters
 *We can achieve through using different data type
 *Overloading concept belongs to Polymorphism
 *Possible in Single & Multiple classes(Inheritance)
*/

public class MethodOverloading {

	public static void main(String[] args) {
		
	Calculator cal = new Calculator();
	System.out.println(cal.add(3, 4, 5));
	System.out.println(cal.add(3, 4.34));

	}

}

class Calculator{
	
	public int add(int n1,int n2) {return n1+n2;}
	public int add(int n1,int n2,int n3) {return n1+n2+n3;}
	public double add(int n1,double n2) {return n1+n2;}
	
}
