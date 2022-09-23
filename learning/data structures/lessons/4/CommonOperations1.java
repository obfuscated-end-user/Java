// linked list common operations using user-defined methods

public class CommonOperations1 {
    Node head;

    // Create a node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
        // insert the data
        // make new node
        Node new_node = new Node(new_data);
        // make new node's next to be that of head, which is something that already exists
        new_node.next = head;
        // change the head node to that of new node
        head = new_node;
    }
    
    // Insert after a node
    public void insertAfter(Node prev_node, int new_data) {
        // if there is no previous node, typically happens if you put in the head, which has no previous node since it is on the start of the list
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        // make new node
        Node new_node = new Node(new_data);
        // set new node's next to that of previous node's next
        new_node.next = prev_node.next;
        // set previous node's next to that of new node, essentially putting the new node between the previous node and previous node's next.
        prev_node.next = new_node;
    }
    
    // Insert at the end
    public void insertAtEnd(int new_data) {
        // make new node with new data, since we're inserting something new
        Node new_node = new Node(new_data);

        // if no head, then put the new node there
        if (head == null) {
            head = new Node(new_data);
            return; // function breaks from here if true
        }

        // since the new node is at the end, it's next value is null
        new_node.next = null;

        // point last to head, to start preparing to traverse the list
        Node last = head;
        // while not at the last position
        while (last.next != null)
            // last++
            last = last.next;

        // finally, put the new node at the end of the list. this won't run until the while loop above is finished.
        last.next = new_node;
        return;
    }
    
    // Delete a node
    void deleteNode(int position) {
        // if there's no head, don't do anything
        if (head == null)
            return;

        // if there is a head, make a temporary pointer to head
        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        Node next = temp.next.next;

        temp.next = next;
    }
    
    // Search a node
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
            }
            return false;
        }
        
        // Sort the linked list
    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        
        if (head == null) {
            return;
        } else {
            while (current != null) {
                // index points to the node next to current
                index = current.next;
                
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    
    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    
    // main class
    
    public static void main(String[] args) {
        CommonOperations1 llist = new CommonOperations1();
        
        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);
        
        System.out.println("Linked list: ");
        llist.printList();
        
        System.out.println("\nAfter deleting an element in position 4: ");
        llist.deleteNode(3);
        llist.printList();
        
        System.out.println("\nSearch 3 in the list");
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");
        
        llist.sortLinkedList(llist.head);
        System.out.println("Sorted List: ");
        llist.printList();
    }
}
