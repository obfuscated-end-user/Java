import java.util.*;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        //Declare Deque object
        LinkedList<String> deque = new LinkedList<>();
        // add elements to the queue using various methods
        deque.add("Apple"); // add()
        deque.addFirst("Mango"); // addFirst()
        deque.addLast("Fries"); // push()
        deque.offer("Paper"); // offer()
        deque.offerFirst("Table"); // offerFirst()
        deque.offerLast("Trees"); // offerLast()
        System.out.println("Initial Deque:");
        System.out.print(deque + " ");

        // Iterate using standard iterator
        System.out.println("\n\nDeque contents using Standard Iterator:");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());

        // Iterate using Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.println("\n\nDeque contents using Reverse Iterator:");
        while (reverse.hasNext())
            System.out.print(" " + reverse.next());

        // Peek() method
        System.out.println("\n\nDeque Peek:" + deque.peek());
        System.out.println("\nDeque,After peek:" + deque);

        // Pop() method
        System.out.println("\nDeque Pop:" + deque.pop());
        System.out.println("\nDeque,After pop:" + deque);

        // contains() method
        System.out.println("\nDeque Contains Pizza: " + deque.contains("Pizza"));

        deque.removeFirst(); // removeFirst()
        System.out.println("\nDeque, after removing " + "first elements: " + deque);
        deque.removeLast(); // removeLast()
        System.out.println("\nDeque, after removing " + "last elements: " + deque);
        System.out.println("\nDeque, size of the elements " + deque.size());
    }
}