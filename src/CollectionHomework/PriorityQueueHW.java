package CollectionHomework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueHW {
	public static void main(String[] args) {
		Queue<Student> studentsQueue = new PriorityQueue<>();
		studentsQueue.add (new Student("Alexey", "Skiba", 23));
		studentsQueue.add(new Student("Ivan", "Ivanov", 19));
		studentsQueue.add(new Student("Lizaveta", "Fralova", 25));
		studentsQueue.add(new Student("Vladislav", "Lukiyanets", 24));
		System.out.println(studentsQueue.element());
		System.out.println(studentsQueue);
		studentsQueue.remove();
		System.out.println(studentsQueue);
		studentsQueue.offer(new Student("Vasiliy", "Vasylyev", 18));
		System.out.println(studentsQueue);
		System.out.println(studentsQueue.peek());
		System.out.println(studentsQueue.poll());
		System.out.println(studentsQueue.poll());
		System.out.println(studentsQueue.poll());





	}
}
