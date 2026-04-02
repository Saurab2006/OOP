package Tutorial;

abstract class Task1 {
	abstract void message();
}
class ChildClass1 extends Task1{
	@Override
	void message() {
	System.out.println("This is first subclass");
	}
}
class ChildClass2 extends Task1{
	@Override
	void message( ) {
		System.out.println("This is second subclass");
	}
}