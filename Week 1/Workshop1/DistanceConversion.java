package Workshop1;

import java.util.Scanner;

public class DistanceConversion {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter distance in miles: ");
	double miles = input.nextDouble();
	
	double kilometer = miles * 1.6093;
	System.out.println("The Distance is: " + kilometer);
	input.close();
}
}