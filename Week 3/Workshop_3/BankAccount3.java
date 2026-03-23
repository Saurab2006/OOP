package Workshop_3;

public class BankAccount3 {
	String name;
    int accountNumber;
    double balance;

    BankAccount3() {
        System.out.println("User created!");
    }

    BankAccount3(String n, int accNo, double bal) {
        name = n;
        accountNumber = accNo;
        balance = bal;

        System.out.println("Account created successfully!");
    }

    void showAccount() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {

        // no-argument constructor
        BankAccount3 user1 = new BankAccount3();

        System.out.println();

        // parameterized constructor
        BankAccount3 user2 = new BankAccount3("Saurabh Kumar Yadav", 1000251, 5000);

        user2.showAccount();
    }
}
