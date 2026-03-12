package Workshop2;

import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks of Physics: ");
		float Phy = sc.nextFloat();

		System.out.print("Enter marks of Chemistry: ");
		float Che = sc.nextFloat();

		System.out.print("Enter marks of Biology: ");
		float Bio = sc.nextFloat();

		System.out.print("Enter marks of Mathematics: ");
		float Math = sc.nextFloat();

		System.out.print("Enter marks of Computer: ");
		float Com = sc.nextFloat();

		float sum = Phy + Che + Bio + Math + Com;
		float per = (sum / 500) * 100;

		System.out.printf("You got %.2f%%\n", per);

		if (per >= 90) {
			System.out.println("Grade A");
		} else if (per >= 80 && per < 90) {
			System.out.println("Grade B");
		} else if (per >= 70 && per < 80) {
			System.out.println("Grade C");
		} else if (per >= 60 && per < 70) {
			System.out.println("Grade D");
		} else if (per >= 40 && per < 60) {
			System.out.println("Grade E");
		} else {
			System.out.println("Fail");
		}

		sc.close();
	}
}