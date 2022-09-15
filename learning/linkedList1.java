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
        if (head == null ) {
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
            return;
        }
        System.out.println("Nodes of singly linked list");
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // woohoo inconsistent formatting motherfuckers
    void insertFirst(int newData) {
        Node new_Node = new Node (newData);
        new_Node.next = head;
        head = new_Node;
    }

    void insertLast(int newData) {
        Node new_Node = new Node (newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        new_Node.next = null;
        Node last = head;

        while (last.next != null)
            last = last.next;

        last.next = new_Node;
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
