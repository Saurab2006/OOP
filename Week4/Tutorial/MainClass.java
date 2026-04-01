package Tutorial;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person {
	String EmployeeId;
	Employee(String name, int age, String EmployeeId) {
		super(name,age);
		this.EmployeeId = EmployeeId;
		
	}
void display() {
	System.out.println("EmployeeId: "+ EmployeeId);
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
}
}

public class MainClass {
	public static void main(String[] args) {
		Employee employee = new Employee("Saurabh", 20, "ABCD");
		employee.display();
	}
}