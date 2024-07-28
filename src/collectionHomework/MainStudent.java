package collectionHomework;

import java.util.*;

public class MainStudent {
	public static void main(String[] args) {

		// ArrayList
		List<Student> students = new ArrayList<>();
		students.add(new Student("Lizaveta", "Fralova", 19));
		students.add(new Student("Vladislav", "Lukiyanets", 17));
		students.add(1, new Student("Alexey", "Ivanov", 20));
		students.add(new Student("Natalya","Dyadelo", 21));
		students.add(new Student("Vladislav", "Lukiyanets", 17));
		System.out.println("List of students: " + students);
		System.out.println(students.get(2));
		students.remove(1);
		students.add(0,new Student("Anastasiya", "Skiba", 22));
		System.out.println("List of students: " + students);
		System.out.println(" ");

		//LinkedList
		List<Student> students1 = new LinkedList<>();
		students1.add(new Student("Vasiliy", "Vasylyev", 18));
		students1.add(new Student("Ivan", "Ivanov", 19));
		students1.add(new Student("Ekaterina", "Yaskevich", 23));
		students1.add(new Student("Elena", "Zayts", 19));
		System.out.println("List of students: " + students1);
		students1.remove(2);
		System.out.println(students1.get(1));
		System.out.println("List of students: " + students1);
		System.out.println(" ");

		//HashSet
		Set<Student> students2 = new HashSet<>();
		Student removedStudent = new Student("Natalya","Dyadelo", 21);
		students2.add(removedStudent);
		students2.add(new Student("Lizaveta", "Fralova", 19));
		students2.add(new Student("Vladislav", "Lukiyanets", 17));
		students2.add(new Student("Vladislav", "Lukiyanets", 17));
		students2.add(new Student("Alexey", "Ivanov", 20));
		for (Student student: students2){
			System.out.println(student);
		}
		System.out.println(" ");
		students2.remove(removedStudent);
		for (Student student: students2){
			System.out.println(student);
		}
		System.out.println(" ");

		//LinkedHashSet
		Set<Student> students3 = new LinkedHashSet<>();
		students3.add(removedStudent);
		Student newStudent = new Student("Lizaveta", "Fralova", 19);
		Student newStudent1 = new Student("Vladislav", "Lukiyanets", 17);
		Student newStudent2 = new Student("Alexey", "Ivanov", 20);
		Student newStudent3 =new Student("Anastasiya", "Skiba", 22);
		Student newStudent4 = new Student("Vasiliy", "Vasylyev", 18);
		Student newStudent5 = new Student("Ivan", "Ivanov", 19);
		students3.add(newStudent);
		students3.add(newStudent1);
		students3.add(newStudent2);
		students3.add(newStudent4);
		students3.add(newStudent3);
		students3.add(newStudent5);
		System.out.println(students3);
		students3.remove(newStudent4);
		System.out.println(students3);
		System.out.println(" ");

		//TreeSet
		Set<Student> students4 = new TreeSet<>();
		students4.add(newStudent);
		students4.add(newStudent1);
		students4.add(newStudent2);
		students4.add(newStudent4);
		students4.add(newStudent3);
		students4.add(newStudent5);
		students4.add(removedStudent);
		System.out.println(students4);
		students4.remove(removedStudent);
		System.out.println(students4);








	}
}
