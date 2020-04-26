package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>();
		queue.add("AAA");
		queue.add("BBB");
		queue.add("CCC");
		queue.add("DDDD");

		System.out.println(queue.peek());
		System.out.println(queue.poll());

	}

}
