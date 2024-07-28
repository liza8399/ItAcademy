package collectionHomework;

import java.util.HashMap;
import java.util.Map;

public class HashMapHW {

	public static void main(String[] args) {

		Map<Integer, Student> studentsMap = new HashMap<>();
		studentsMap.put(1, new Student("Lizaveta", "Fralova", 25));
		studentsMap.put(3, new Student("Vladislav", "Lukiyanets", 24));
		studentsMap.put(2, new Student("Alexey", "Skiba", 23));
		studentsMap.put(4, new Student("Ivan", "Ivanov", 19));
		System.out.println(studentsMap);
		studentsMap.put(3, new Student("Ekaterina", "Yaskevich", 23));
		System.out.println(studentsMap.get(3));
		studentsMap.remove(1);
		System.out.println(studentsMap);


	}
}
