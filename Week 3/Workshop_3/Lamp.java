package Workshop_3;

class Lamp {
	boolean isOn;
	void turnOn() {
		isOn = true;
		System.out.println("Light is On");
	}	
		void turnOff() {
			isOn = false;
			System.out.println("Light is OFF");
	}
		public static void main(String[] args) {
			Lamp l = new Lamp();
	        l.turnOn();
	        l.turnOff();
		}

}
