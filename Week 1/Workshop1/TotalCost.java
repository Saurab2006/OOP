package Workshop1;

import java.util.Scanner;

public class TotalCost {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int quantity = input.nextInt();
		
		System.out.print("Enter price: ");
		int price = input.nextInt();
		
		double Total = quantity * price;
		System.out.println("The total is: " + Total);
		input.close();
	}
}