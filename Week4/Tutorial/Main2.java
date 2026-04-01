package Tutorial;
class Animal {
	void makeSound() {
		System.out.println("The animal make sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("The Dog is barking");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("The Cat is meowing");
	}
}

public class Main2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.makeSound();
		cat.makeSound();

	}

}
