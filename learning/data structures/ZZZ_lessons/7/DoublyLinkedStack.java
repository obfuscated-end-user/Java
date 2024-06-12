public class DoublyLinkedStack {
    static class Node {
        int data;   // the data in the node
        Node prev;  // current node's previous node
        Node next;  // current node's next node
    };

    static Node start = null;   // start of the stack, the first element inserted, which is at the bottom
    static Node top = null;     // top of the stack, the last element inserted

    // Check if stack is empty
    public static boolean isEmpty() {
        // if start is not null, then it means that it has 1 or more elements in it
        return start == null;
    }

    // Add elements onto stack
    // modify the variable names, especially the single-letter ones, to understand this better
    // edit: done
    public static void push(int data) {
        // make a new node
        Node newNode = new Node();
        // insert the data you provided into this new node
        newNode.data = data;
        // if stack is empty, then put the new node in the stack
        if (isEmpty()) {
            // nothing below it
            newNode.prev = null;
            // nothing above it
            newNode.next = null;
            // since there's only one node at the moment, the new node is both the top and bottom
            start = newNode;
            top = newNode;
        // else, put it on top of the stack
        } else {
            // current node's next element is set to new node
            top.next = newNode;
            // nothing's on top of the new node
            newNode.next = null;
            // the former element at the top is what is under the new node
            newNode.prev = top;
            // the new top element is now the new node you just pushed
            top = newNode;
        }
    }

    // Delete the top element from stack
    // imagine something popping off the stack shut up bad analogy
    public static void pop() {
        // create an empty node, not a new node
        Node node;
        // set node's value to the top element
        node = top;
        // do nothing if there's nothing to pop off
        if (isEmpty())
            System.out.println("Stack is empty");
        // else if there's only one element, remove it completely by setting both the top and bottom values to null. not sure if the data itself is still there, as if that memory space is just marked "null".
        else if (top == start) {
            top = null;
            start = null;
        } else {
            // else, set the element above the second element to be null. you can visualize this by top, top.prev (go back once), top.prev.next (go back once, then back again), and set that element to null.
            top.prev.next = null;
            // the element now at the top of the stack is the element that was under top earlier
            top = node.prev;
        }
    }

    // Peek top element of the stack
    public static void topElement() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("The element at top of the stack is : " + top.data);
    }

    // Determines the size of the stack
    public static void stackSize() {
        // used to count the elements in the stack
        int count = 0;
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            // make a pointer to reference the node at the start of the stack (the element at the bottom)
            Node ptr = start;
            // while there are elements remaining to be counted in the stack, "while hasNext()"
            while (ptr != null) {
                // increment count
                count++;
                // go to next element. eventually this will go to the top of the stack, when ptr.next becomes null
                ptr = ptr.next;
            }
        }
        System.out.println("Size of the stack is : " + count);
    }

    // Prints the stack
    // comment originally said "Determines the size of the stack", duplicated from the stackSizes()'s comment
    public static void printStack() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            Node ptr = start;
            System.out.print("Stack is : ");
            while (ptr != null) {
                // same thing as earlier, except print each node's data as a string
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        push(200);
        push(100);
        push(300);
        push(400);
        push(50);
        printStack();
        topElement();
        stackSize();
        pop();
        System.out.println("\nElement was popped from the stack ");
        topElement();
        pop();
        System.out.print("\nElement was popped from the stack \n");
        stackSize();
        printStack();
    }
}
