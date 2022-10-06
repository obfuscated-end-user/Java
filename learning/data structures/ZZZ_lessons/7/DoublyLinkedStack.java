public class DoublyLinkedStack {
    static class Node {
        int data;
        Node prev;
        Node next;
    };

    static Node start = null;
    static Node top = null;

    // Check if stack is empty
    public static boolean isEmpty() {
        return start == null;
    }

    // add elements onto stack
    public static void push(int d) {
        Node n = new Node();
        n.data = d;
        if (isEmpty()) {
            n.prev = null;
            n.next = null;
            start = n;
            top = n;
        } else {
            top.next = n;
            n.next = null;
            n.prev = top;
            top = n;
        }
    }

    // delete the top element from stack
    public static void pop() {
        Node n;
        n = top;
        if (isEmpty())
            System.out.println("Stack is empty");
        else if (top == start) {
            top = null;
            start = null;
        } else {
            top.prev.next = null;
            top = n.prev;
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
        int c = 0;
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            Node ptr = start;
            while (ptr != null) {
                c++;    // stupid fucking variable name
                ptr = ptr.next;
            }
        }
        System.out.println("Size of the stack is : " + c);
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
