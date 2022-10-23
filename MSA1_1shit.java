import java.util.LinkedList;

// https://www.geeksforgeeks.org/find-smallest-largest-elements-singly-linked-list/
// https://www.geeksforgeeks.org/linked-list-in-java/
// https://www.google.com/search?client=firefox-b-d&q=java+linked+list+methods

public class MSA1_1shit {
    public static void main(String[] args) {
        // Problem 1. Using the singly linked list data structure (1) add the given nodes 13, 3, 22, 9 & 7 then (2) display the nodes 3) determine the minimum value in the list and the (4) maximum value in the list such as shown in the example below:
        LinkedList<Integer> linkedList = new LinkedList<>();

        // add the given nodes 13, 3, 22, 9 & 7
        linkedList.add(13);
        linkedList.add(3);
        linkedList.add(22);
        linkedList.add(9);
        // linkedList.add(2);
        linkedList.add(7);

        // display the nodes
        System.out.println("The nodes are: " + linkedList);

        // determine the minimum value in the list
        int min = 0;
        int count = 0;
        int size = linkedList.size();
        for (int i = 0; i < size; ++i) {
            /* if (min < linkedList.get(i)) {
                min = linkedList.get(i);
            } else if (min > linkedList.get(i)) {
                min = linkedList.get(i);
            }
            System.out.println(min); */
            min = Math.min(linkedList.get(i), linkedList.get(size - 1));
            System.out.println(min);
        }

        for (LinkedList<Integer> first = linkedList, int min = linkedList.getFirst(); ++i) {
            min = Math.min(linkedList.get(i), linkedList.get(size-1));
            System.out.println(min);
        }

        /* while (min < linkedList.get(size - 1)) {
            if (linkedList.get(count) < linkedList.get(count + 1)) {
                min = linkedList.get(count);
            } else {
                min = linkedList.get(size - 1);
            }
            System.out.println(min);
            ++count;
        } */

        /* static int smallestElement(Node head) {
            
            // Declare a min variable and initialize
            // it with INT_MAX value.
            // INT_MAX is integer type and its value
            // is 32767 or greater.
            int min = Integer.MAX_VALUE;
        
            // Check loop while head not equal to NULL
            while (head != null)
            {
        
                // If min is greater than head->data then
                // assign value of head->data to min
                // otherwise node point to next node.
                if (min > head.data)
                    min = head.data;
        
                head = head.next;
            }
            return min;
        } */
        System.out.println("Minimum value in the list is : " + min);
    }
}