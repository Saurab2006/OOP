package Workshop2;

import java.util.Scanner;

public class ExamChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a medical cause? (y/n)");
	    char answer = sc.next().charAt(0);

	    if (answer =='y'|| answer == 'Y') {
	        System.out.println("You are not allowed to sit in the exam.");
	    } else if (answer == 'n' || answer == 'N') {
	        System.out.println("You can sit in the exam.");
	    } else {
	        System.out.println("Invalid input. Please enter 'y' or 'n'.");
	    }
	    sc.close();
		
	}

}
