package Inheritance;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add ("Second");

		List <String> linkedList = new LinkedList<>();

		Set<Cat> set = new TreeSet<>();
		for (int i = 0; i<100; i++){
			set.add(new Cat(100-i, "Murzik" + i));
		}
		for (Cat cat: set){
			System.out.println(cat);
		}


	}
}
