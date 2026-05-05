package Workshop;

//Customer
class Customer {
 private String firstName;
 private String lastName;

 Customer(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 void getDetails() {
     System.out.println("Customer: " + firstName + " " + lastName);
 }
}

//Account
class Account extends Customer {
 private int accountNumber;
 private double balance;

 Account(String firstName, String lastName, int accountNumber, double balance) {
     super(firstName, lastName);
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 void showBalance() {
     System.out.println("Balance: " + balance);
 }
}

//Transaction
class Transaction {
 void transfer(Account from, Account to, double amount) {
     System.out.println("Transferring " + amount);
     from.withdraw(amount);
     to.deposit(amount);
 }
}

//Test
public class Test {
 public static void main(String[] args) {

     Account acc1 = new Account("Saurabh", "Yadav", 101, 1000);
     Account acc2 = new Account("Ram", "Shyam", 102, 500);
     acc1.getDetails();
     acc2.getDetails();
     acc1.deposit(200);
     acc1.withdraw(100);
     Transaction t = new Transaction();
     t.transfer(acc1, acc2, 300);
     acc1.showBalance();
     acc2.showBalance();
 }
}