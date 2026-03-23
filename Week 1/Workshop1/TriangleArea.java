package Workshop1;
import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enetr side a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter side b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter side c: ");
		double c = input.nextDouble();
		
		double s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of Traiangle: " +  area);
		input.close();
	}

}
