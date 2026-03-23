package Workshop1;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side length: ");
        double side = input.nextDouble();

        double area = side * side;
        System.out.println("Area of the square: " + area);
        input.close();
    }
}
