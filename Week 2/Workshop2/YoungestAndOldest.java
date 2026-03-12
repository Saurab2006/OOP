package Workshop2;

import java.util.Scanner;

public class YoungestAndOldest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first age: ");
		int age1 = sc.nextInt();
		System.out.print("Enter second age: ");
		int age2 = sc.nextInt();
		if(age1 > age2) {
			System.out.println(age1 + " is Oldest and " + age2 + " is Youngest");
			
		}else if(age2 > age1) {
			System.out.println(age2 + " is Oldest and " + age1 + " is Youngest");
		}else {
			System.out.println("Both are of same age");
		}
		sc.close();

	}

}
