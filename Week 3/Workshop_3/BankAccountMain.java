package Workshop_3;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.accountNumber = 4592143;
		account.balance = 96000.77;
		account.accountHolderName = "Saurabh Kumar Yadav";
		account.accountHolderAddress = "Biratnagar";
		
		 System.out.println("Account Number: " + account.accountNumber);
	     System.out.println("Balance: " + account.balance);
	     System.out.println("Account Holder Name: " + account.accountHolderName);
         System.out.println("Account Holder Address: " + account.accountHolderAddress);

	}

}
