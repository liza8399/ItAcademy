package Inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		System.out.println(list.contains("Third"));
		System.out.println(list.indexOf("Second"));
		System.out.println(list.get(0));
		list.remove("Second");

		List<String> LinkedList = new LinkedList<>();
		LinkedList.add("Hello");
		LinkedList.add("Hello1");
		LinkedList.get(1);





	}
}
