package Workshop2;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		if(marks>=40 && marks<50) {
			System.out.println("Your grade is C");
		} else if(marks>=50 && marks<60) {
			System.out.println("Your grade is C+");
		} else if (marks >= 60 && marks < 70) {
            System.out.println("Your grade is B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Your grade is B+");
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("Your grade is A");
        } else if (marks > 90) {
            System.out.println("Your grade is A+");
        } else {
            System.out.println("Marks are below 40 - Fail");
            sc.close();
        }
	}

}
