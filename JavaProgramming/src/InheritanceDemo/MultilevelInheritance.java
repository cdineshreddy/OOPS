package InheritanceDemo;

//in the same package we can't create same class name

class AA {
	
	int a;
	void display() { System.out.println(a); }
}

class BB extends AA{
	
	int b;
	void show() { System.out.println(b); }
	
}

class C extends BB {
	
	int c;
	void print() { System.out.println(c); }
}




public class MultilevelInheritance {

	public static void main(String[] args) {
		
		C cObj = new C();
		cObj.a=10;
		cObj.b=20;
		cObj.c=30;
		
		cObj.display();
		cObj.show();
		cObj.print();
	

	}

}
