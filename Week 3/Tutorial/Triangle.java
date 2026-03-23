package Tutorial;

public class Triangle {
	double base ;
	double height;
	Triangle(double a, double b) {
		base = a;
		height = b;
	}
	void view() {
		double d = (1.0/2.0)*base*height;
		System.out.println(d);
	}

}
