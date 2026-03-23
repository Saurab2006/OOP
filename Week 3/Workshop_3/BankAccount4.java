package Workshop_3;

public class BankAccount4 {
	private String name;
    private int accountNumber;
    private double balance;

    BankAccount4(String n, int accNo, double bal) {
        name = n;
        accountNumber = accNo;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    void showAccount() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {

        BankAccount4 acc = new BankAccount4("Saurabh Kumar Yadav", 100025101, 5000);
        System.out.println("Balance is: " + acc.getBalance());
        System.out.println();
        acc.showAccount();
    }

}
