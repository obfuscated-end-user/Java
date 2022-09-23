import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> Names = new LinkedList<>();
        // Adding names to the linked list
        Names.add("John");
        Names.add("Eva");
        Names.add("Ray");
        Names.add("Ferds");
        Names.add("Sheeda");

        // Display all the elements.
        System.out.println("The names inside of LinkedList: " + Names);
    }
}