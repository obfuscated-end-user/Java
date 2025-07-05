public class LinkedList1 {
	// Represent a node of the singly linked list
	class Node {
		int data;
		Node next;
		
		// constructor
		Node(int data) {	
			this.data = data;
			this.next = null;
		}
	}
	
	// Represent the head and tail of the singly linked list
	Node head = null;
	Node tail = null;
	
	// addNode() will add a new node to the list
	void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);
		// System.out.println(newNode);
		
		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			// tl;dr tail's next is newNode, which is what you added.
			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}
	
	// display() will display all the nodes present in the list
	void display() {
		// Node current will point to head
		Node current = head;
		
		// if no head
		if (head == null) {
			System.out.println("List is empty");
			return; // exit the function immediately
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			// "current++" even though that doesn't make any sense
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList1 List1 = new LinkedList1();
		
		// Add nodes to the list
		List1.addNode(12);
		List1.addNode(82);
		List1.addNode(13);
		List1.addNode(45);
		List1.addNode(20);
		
		// Displays the nodes present in the list
		List1.display();
	}
}