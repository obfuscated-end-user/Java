public class CreateDoubly {
    class Node {
        String data;
        Node prev;
        Node next;
        
        public Node (String data) {
            this.data = data;
        }
    }
    
    Node head = null;
    Node tail = null;
    
    public void addNew (String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    
    public void PrintData() {
        Node current = head;
        if (head == null) {
            System.out.println ("List is Empty");
        }
        System.out.println("The Nodes are:");
        while(current != null) {
            // guy probably meant print(), but messed up
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        CreateDoubly Data = new CreateDoubly();
        Data.addNew("Edzel");
        Data.addNew("Klive");
        Data.addNew("Aaron");
        Data.addNew("diosa");
        Data.PrintData();
    }
}
