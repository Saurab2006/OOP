package Workshop_3;

class BankAccount5 {
    String name;
    int accountNumber;
    double balance;
    
    BankAccount5() {
        name = "Anup";
        accountNumber = 100000;
        balance = 0;
    }

    BankAccount5(String name) {
        this.name = name;
        this.accountNumber = 0;
        this.balance = 0;
    }

    BankAccount5(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = 0;
    }

    BankAccount5(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    
    public static void main(String[] args) {

        BankAccount5 b1 = new BankAccount5();
        BankAccount5 b2 = new BankAccount5("Saurabh");
        BankAccount5 b3 = new BankAccount5("Samip", 5000);
        BankAccount5 b4 = new BankAccount5("Don", 101, 10000);

        b1.showAccount();
        b2.showAccount();
        b3.showAccount();
        b4.showAccount();
    }
}
