package Inheritance;

import java.util.HashSet;
import java.util.Set;

public class AnimalMain {
	public static void main(String[] args) {

		Cat cat = new Cat(5, "Murzik");
		Cat cat1 = new Cat(15, "Murzik");

		System.out.println(cat.hashCode());
		System.out.println(cat1.hashCode());
		System.out.println(cat.equals(cat1));

		Set<Cat> cats = new HashSet<>();


		Engine engine = new Engine(250);
		Car car = new Car(engine, "BMW");

		Engine engine1 = new Engine(300);
		Car car1 = new Car (engine1, "Ford");
		System.out.println(car.equals(car1));

		IFly bird = new Bird();
		bird.fly();

		IMove cat3 = new Cat(15, "Vasya");
		cat3.saySmth();

	}
}
