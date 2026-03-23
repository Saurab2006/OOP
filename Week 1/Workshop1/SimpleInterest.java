package Workshop1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter time): ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
        input.close();
    }
}
