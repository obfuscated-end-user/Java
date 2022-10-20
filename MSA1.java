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

    void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    int minimum() {
        Node current = head;
        int min = 0;

        if (head == null)
            System.out.println("List is empty");
        else {
            min = head.data;
            while (current != null) {
                // if min has a larger value than current.data, assuming that whatever is in current.data is smaller than min, then replace the value of min with that of current.data.
                if (min > current.data)
                    min = current.data;
                current = current.next;
            }
        }
        return min;
    }

    int maximum() {
        Node current = head;
        int max = 0;
        if (head == null)
            System.out.println("List is empty");
        else {
            max = head.data;
            while (current != null) {
                // if max's value is less than current.data, assume that whatever is in max is smaller than current.data. evaluate max to whatever is in current.data
                if (max < current.data)
                    max = current.data;
                current = current.next;
            }  
        }
        return max;
    }

    // Problem 1. Using the singly linked list data structure (1) add the given nodes 13, 3, 22, 9 & 7 then (2) display the nodes 3) determine the minimum value in the list and the (4) maximum value in the list such as shown in the example below:
    public static void main(String[] args) {
        // add the given nodes 13, 3, 22, 9 & 7
        MSA1 list = new MSA1();
        list.addNode(13);
        list.addNode(3);
        list.addNode(22);
        list.addNode(9);
        list.addNode(7);

        // display the nodes
        System.out.print("The nodes are: ");
        list.printList();

        // determine the minimum value in the list
        System.out.println("Minimum value in the list is: " + list.minimum());

        // maximum value in the list
        System.out.println("Maximum value in the list is: " + list.maximum());
    }
}