package Inheritance;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"First");
		map.put(2,"Second");
		map.put(3, "Third");
		System.out.println(map.get(1));
		System.out.println(map.getOrDefault(3,"Default"));

		for(String a:map.values()){
			System.out.println(a);
		}

		Queue<String> a = new PriorityQueue<>();
		a.add("b");
		a.add("c");
		a.add("a");
		a.add("d");
		a.offer("f");
		System.out.println(a);

		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a.poll());

		Stack<String> b = new Stack<>();
		a.add("c");
		a.add("b");
		a.add("f");


	}

}
