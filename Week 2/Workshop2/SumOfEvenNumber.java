package Workshop2;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num) {
			if(i % 2 == 0) {
				sum = sum + i;
			} i++;
		}
		System.out.println("The sum of n even number is " + sum);
		sc.close();

	}

}
