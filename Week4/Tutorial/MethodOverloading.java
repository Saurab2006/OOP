package Tutorial;
class AreaCalculator {
	void calculatorArea(int length, int breadth) {
		System.out.println("The area of rectangle is " + length * breadth);
	}

void calculatorArea(int length) {
	System.out.println("The area of square is " + length*length);
	}

void calculatorArea(double base , double height) {
	System.out.println("The area of triangle is " + 0.5*base*height);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator area = new AreaCalculator();
		area.calculatorArea(5, 5);
		area.calculatorArea(5.0, 5.0);
		area.calculatorArea(5);

	}

}
