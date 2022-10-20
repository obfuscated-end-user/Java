import java.util.LinkedList;

public class MSA1 {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;
    
    //addNode() will add a new node to the list
    void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insert after a node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
        return;
    }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Insert at the end
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    // Delete a node
    void deleteNode(int position) {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }
    
    // Implement a method that remove a node with the given data from the link list.
    void remove(int data) {
        Node temp = head, prev = null;
        
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp == null) {
            return;
        }
        
        prev.next = temp.next;
        System.out.println(data + " has been removed from the list");
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
    
    // Implement a method that will inserts a new node with the given data at the front of the linked list
    void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Count the total number of nodes in the list
    int countNodes() {
        int count = 0;    
        Node current = head; 
            
        while(current != null) {      
            count++;    
            current = current.next;    
        }    
        return count;
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    // Problem 1. Using the singly linked list data structure (1) add the given nodes 13, 3, 22, 9 & 7 then (2) display the nodes 3) determine the minimum value in the list and the (4) maximum value in the list such as shown in the example below:
    public static void main(String[] args) {
        
    }
}
