package Workshop;

abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    double length;
    double width;
    Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Quadrilateral: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Quadrilateral: " + perimeter);
    }
}