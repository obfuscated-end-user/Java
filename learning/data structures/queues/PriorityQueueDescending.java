import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDescending {
	// remember, the interace used on the previous priority queue is Comparable. this uses Comparator and this overloads a method named compare() from there. i don't know if you "overload" interface function declarations, but whatever.
	static class CustomIntegerComparator implements Comparator<Integer> {
		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? 1 : -1;
		}
	}
	public static void main(String[] args) {
		Queue<Integer> DescPQ = new PriorityQueue<>(new CustomIntegerComparator());
		DescPQ.add(1);
		DescPQ.add(5);
		DescPQ.add(7);
		DescPQ.add(12);
		DescPQ.add(3);

		System.out.println("Integers stored in descending order of priority in a Priority Queue\n");
		while (!DescPQ.isEmpty())
			System.out.println(DescPQ.poll());
	}
}
