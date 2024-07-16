package Inheritance;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Cat extends Animal implements IMove, Comparable<Cat>{

	private String name;

	public Cat(int age, String name) {
		super(age);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				"} " + "age= " + getAge();
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return Objects.equals(name, cat.name) && getAge() == cat.getAge();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name) + getAge();
	}

	public void print(){
		System.out.println("No parameter");
	}

	public void print(int a){
		System.out.println("Integer = " + a);
	}

	public void print(String a){
		System.out.println("String = " + a);
	}


	public void print(int a, int b){
		System.out.println("Integer = " + a + " and " + b);
	}


	@Override
	public int compareTo(@NotNull Cat o) {
		return this.getAge() - o.getAge();
	}
}
