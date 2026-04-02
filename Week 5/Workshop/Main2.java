package Workshop;

public class Main2 {

	public static void main(String[] args) {
//Abstraction	
		// TODO Auto-generated method stub
		Quadrilateral q = new Quadrilateral(7, 7);
        q.calculateArea();
        q.calculatePerimeter();
        

      Bus b = new Bus();
      b.wheel();
      b.door();

//Interface  	
      Cow c = new Cow();
       c.eat();
       c.walk();
       c.display();


//Classes
Fish f = new Fish();
Bird b1 = new Bird();

f.specialFeature();
b1.specialFeature();
	}
}