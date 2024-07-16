package Inheritance;

public abstract class Animal implements IMove {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(int age) {
		this.age = age;
	}

	public void move() {
		System.out.println("Moving");
	}

	public void say(){
		System.out.println("I'm animal");
	}
}
