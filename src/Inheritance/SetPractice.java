package Inheritance;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	public static void main(String[] args) {
		Set<Cat> set= new TreeSet<>();
		set.add(new Cat(5,"Murzik"));
		set.add(new Cat(7,"Vasya"));
		set.add(new Cat(9,"Murzik"));
		set.add(new Cat(3,"Murzik3"));
		for (Cat cat: set){
			System.out.println(cat);
		}
		System.out.println(set.size());
	}
}
