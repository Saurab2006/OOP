package Workshop_3;

public class Customer {
	private int customerId;
	private String name;
	private String BankAccount;
	
	Customer(int customerId, String name, String BankAccount){
		this.customerId = customerId;
		this.name = name;
		this.BankAccount = BankAccount;
	}
	
	// Getter method
	public int getcustomerId() {
		return customerId;
	}
	
	public String getname() {
		return name;
	}
	
	public String getBankAccount() {
		return BankAccount;
	}
	
    public static void main(String[] args) {
    	
    	Customer c1 = new Customer(1, "Saurabh" , "acc1");
    	Customer c2 = new Customer(2, "Raja" , "acc2");
    	
    	System.out.println("Customer 1 ID: " + c1.getcustomerId());
    	System.out.println("Customer 1 Name: " + c1.getname());
    	System.out.println("Customer 1 BankAccount: " + c1.getBankAccount());
    	
    	System.out.println();
    	
    	System.out.println("Customer 2 ID: " + c2.getcustomerId());
    	System.out.println("Customer 2 Name: " + c2.getname());
    	System.out.println("Customer 2 BankAccount: " + c2.getBankAccount());
    	
    	
    }
}
