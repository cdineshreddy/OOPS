package Programs;


/* Encapsulation
 *---------------------------------------------*
 1. All variables should be private
 2. For every variable there should be 2 methods(Get & Set)
 3. Variables can be operated only through Methods
 */

public class Account {
	
	private int accno;
	private String name;
	private double amount;
	
	
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}



	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccno(1234);
		account.setName("Dinesh");
		account.setAmount(100.20);
		
		System.out.println(account.getAccno());
		System.out.println(account.getName());
		System.out.println(account.getAmount());

	}

}
