package Workshop;

interface Animal1 {
	    void eat();
	    void walk();
}

interface Printable {
    void display();
}

interface LivingBeing {
    void specialFeature();
}
class Cow implements Animal1, Printable {

    public void eat() {
        System.out.println("Cow eats grass");
    }

    public void walk() {
        System.out.println("Cow walks with 4 legs");
    }

    public void display() {
        System.out.println("This is a cow");
    }
}
