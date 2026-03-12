package Tutorial;

import java.util.Scanner;

public class Task4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter gender (M/F): ");
        String gender = sc.next();

        switch (gender) {
            case "M":
            case "m":
                System.out.println("Male");
                break;

            case "F":
            case "f":
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid gender");
        }

        sc.close();
    }
}