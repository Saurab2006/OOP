package Workshop1;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        
        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + (num1 - num2));
        System.out.println("The Product is: " + (num1 * num2));
        System.out.println("The Quotient is: " + ((double)num1 / num2));
        input.close();
    }
}