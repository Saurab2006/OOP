package Workshop_3;

class Box {
	double width;
	double height;
	double depth;
	
	Box() {
		width = 10;
		height = 8;
		depth = 12;
	}
	Box(double side) {
		width = height = depth = side;
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	 void getVolume() {
	        double volume = width * height * depth;
	        System.out.println("Volume is: " + volume);
	 }
	 
	    public static void main(String[] args) {
	        Box b1 = new Box();
	        b1.getVolume();

	        Box b2 = new Box(5);
	        b2.getVolume();

	        Box b3 = new Box(5, 3, 4);
	        b3.getVolume();
	  }
}
