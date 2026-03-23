package Workshop1;

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double r = input.nextDouble();
		
		System.out.print("Enter height: ");
		double h = input.nextDouble();
		
		double volume = Math.PI * (r * r * h);
		System.out.println("The volume of cylinder: " + volume);
		input.close();
	}

}
