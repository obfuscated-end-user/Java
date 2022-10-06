// linked list common operations using built-in methods

import java.util.LinkedList;

public class CommonOperations2 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Vangie");
        friends.add("Josie");
        friends.add("Wheng");
        friends.add("Cel");
        friends.add("Riza");
        System.out.println("Initial LinkedList : " + friends);

        friends.add(3, "Francis");
        System.out.println("After add(3, \"Francis\") was added : " + friends);
        friends.addFirst("Yvan");
        System.out.println("After addFirst(\"Yvan\") was added : " + friends);
        friends.addLast("Maverick");
        System.out.println("After addLast(\"Maverick\")was added : " + friends);
        friends.remove();
        System.out.println("After remove() (\"Yvan\") was removed: " + friends);
        friends.remove(2);
        System.out.println("After remove(3) (\"Wheng\" )was removed : " + friends);
        friends.removeFirst();
        System.out.println("After removeFirst(\"Vangie\") was removed : " + friends);
        friends.removeLast();
        System.out.println("After removeLast(\"Maverick\") was removed : " + friends);
        friends.set(0, "YvanVryx");
        System.out.println("After set(0)(\"YvanVryx\") replaced Josie : " + friends);
        System.out.println("After get(2)(\"Cel\") was returned : " + friends.get(2));
    }
}
