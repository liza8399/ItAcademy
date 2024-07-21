package CollectionHomework;

import java.util.Stack;

public class StackHW {
	public static void main(String[] args) {
		Stack<Student> studentStack = new Stack<>();
		studentStack.add(new Student("Ivan", "Ivanov", 19));
		studentStack.add(new Student("Vladislav", "Lukiyanets", 24));
		studentStack.add(new Student("Alexey", "Skiba", 23));
		studentStack.add(new Student("Vasiliy", "Vasylyev", 18));
		System.out.println(studentStack);
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println(studentStack);

	}
}
