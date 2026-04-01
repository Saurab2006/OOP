package Tutorial;
class Shape {
	String color;
	Shape(String color){
		this.color = color;
	}
	void area() {
		System.out.println("This is area");
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	Rectangle(int length, int width, String color){
		super(color);
		this.length = length;
		this.width = width;
		
	}
void display() {
	System.out.println("Length:" + length);
	System.out.println("Width: "+ width);
	System.out.println("Color: "+ color);
	super.area();
}
}


public class SuperKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(1,2,"Black");
		rectangle.display();

	}

}
