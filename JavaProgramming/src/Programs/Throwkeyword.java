package Programs;

public class Throwkeyword {
	
	void checkSum(int num) {
		if(num<1) throw new ArithmeticException("Number is negative");
		else System.out.println(num*num);
	}

	public static void main(String[] args) {
		
		Throwkeyword tk = new Throwkeyword();
		try {
		tk.checkSum(0);
		} catch (Exception e) {
			System.out.println("Data is invalid");
		}
	}

}
