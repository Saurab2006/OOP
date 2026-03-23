package Workshop1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println(
    "Addition: " + (a + b) + "\n" +
    "Subtraction: " + (a - b) + "\n" +
    "Multiplication: " + (a * b) + "\n" +
    "Division: " + (a / b)
);
        input.close();
    }
}

