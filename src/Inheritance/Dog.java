package Inheritance;

public class Dog extends Animal {

	public Dog(int age) {
		super(age);
	}

	@Override
	public void say() {
		System.out.println("I'm dog");
	}
}
