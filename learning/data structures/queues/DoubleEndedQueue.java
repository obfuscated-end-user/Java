import java.util.*;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        //Declare Deque object
        LinkedList<String> deque = new LinkedList<>();
        // add elements to the queue using various methods

        // add element to the rear
        deque.add("Apple"); // add()
        // add element to the front
        deque.addFirst("Mango"); // addFirst()
        // functions exactly the same as add()
        deque.addLast("Fries"); // push()
        // add the element to the rear and make it the "tail", or the last element in the list
        deque.offer("Paper"); // offer()
        // add to the front
        deque.offerFirst("Table"); // offerFirst()
        // add to the last
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