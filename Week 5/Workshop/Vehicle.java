package Workshop;

public abstract class Vehicle {
	abstract void wheel();
	void door() {
		System.out.println("The vehicle named is bus");
	}
}

class Bus extends Vehicle {
    @Override
    void wheel() {
        System.out.println("The Bus will run in 120km/hr.");
    }
}