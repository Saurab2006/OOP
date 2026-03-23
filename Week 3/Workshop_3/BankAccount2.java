package Workshop_3;

class BankAccount2 {
	double balance;
	
	BankAccount2(double b) {
		balance = b;
	}
	void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("Money is deposited: " + amount);
        System.out.println("Current balance is: " + balance);
    }

    void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Money is withdrawl: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("Current balance is: " + balance);
}


    public static void main(String[] args) {
        BankAccount2 myAcc = new BankAccount2(1000);
        myAcc.depositMoney(200);
        myAcc.withdrawMoney(150);
    }
}