import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {   // can't name this file to PriorityQueue
	public static void main(String[] args) {
		Queue<String> PQ = new PriorityQueue<>();
		PQ.add("hello");
		PQ.add("I am");
		PQ.add("dQw4w9WgXcQ");

		System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
		while (!PQ.isEmpty())
			System.out.println(PQ.poll());
	}
}

/*
shows this in terminal:
dQw4w9WgXcQ
I am
hello
*/