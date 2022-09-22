// tangina kinopya ko lang to don sa gc para at least alam mo ginawa nila bobo

public class linkedList1 {

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return; // exit the function immediately
        }
        System.out.println("Nodes of singly linked list");
        while (current != null) {   // while there are still nodes
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // woohoo inconsistent formatting motherfuckers
    void insertFirst(int newData) {
        Node new_Node = new Node(newData);  // initialize new node
        new_Node.next = head;               // set new node's next value to the old head node
        head = new_Node;                    // set the value of head to that of new node, because it is now the first node
    }

    void insertLast(int newData) {
        Node new_Node = new Node(newData);

        if (head == null) { // if there are no node
            head = new Node(newData);   // insert and initialize new node
            return; // exit the function, since there is only one node, therefore it is the last node
        }
        new_Node.next = null;   // there's nothing after the last node, that's why it's set to null
        Node last = head;   // not sure

        while (last.next != null)   // while there is a node
            last = last.next;       // set old last's next node value to the next value of itself

        last.next = new_Node;   // set the new last's value to that of new_Node
        return;
    }

    public static void main(String[] args) {
        linkedList1 List1 = new linkedList1();
        List1.addNode(12);
        List1.addNode(82);
        List1.addNode(13);
        List1.addNode(45);
        List1.addNode(20);

        List1.insertFirst(100);
        List1.insertLast(200);
        List1.display();
    }
}
