package Workshop1;

import java.util.Scanner;

public class MoneyExchangeRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount in U.S. Dollar: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter exchange rate: ");
		double rate = input.nextDouble();
		
		double converted = amount * rate ;
		System.out.println("The converted amount is " + converted);
		input.close();
	}
}