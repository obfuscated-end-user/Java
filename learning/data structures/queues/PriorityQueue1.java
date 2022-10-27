import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {   // can't name this file to PriorityQueue
    public static void main(String[] args) {
        Queue<String> PQ = new PriorityQueue<>();
        PQ.add("hello");
        PQ.add("I am");
        PQ.add("BSCS");
        PQ.add("1");
        PQ.add("2");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!PQ.isEmpty()) {
            System.out.println(PQ.poll());
        }
    }
}