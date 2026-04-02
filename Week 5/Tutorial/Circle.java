package Tutorial;
interface Shape5 {
	public void calculateArea();
}

class Circle implements Shape5{
	int r;
	Circle(int r){
		this.r = r;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle: " + 3.14 * r * r);
	}
}

class Rectangle implements Shape5{
	int l;
	int b;
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle: " + l * b);
	}
}