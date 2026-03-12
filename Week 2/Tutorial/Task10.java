package Tutorial;

import java.util.Scanner;

public class Task10 {
	 public static void main(String[] args) {
		         Scanner sc = new Scanner(System.in);
		         System.out.print("Enter a number: ");
		         int num = sc.nextInt();
		         sc.close();
		         
		         int factorial = 1;
		         for (int i = 1; i <= num; i++) {
		             factorial *= i;
		         }
		         
		         System.out.println(factorial);
		     }
		 }