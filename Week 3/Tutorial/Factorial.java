package Tutorial;

public class Factorial {

	public static void displayFactorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}