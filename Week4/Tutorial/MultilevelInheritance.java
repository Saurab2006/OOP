package Tutorial;
class A {
	void display() {
		System.out.println("Class A");
	}
}
class B extends A {
	@Override
	void display () {
		System.out.println("Class B");
	}
}

class C extends B {
	@Override
	void display() {
		System.out.println("Class C");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.display();

	}

}
