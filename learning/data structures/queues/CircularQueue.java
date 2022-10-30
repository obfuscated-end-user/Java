// user-defined circular queue. works almost the same as the linear variant, but it circles around lol idk wtf
// read the linear queue first. most of the functions here do the same thing except for some minor modifications.
public class CircularQueue {
    // Circular Queue implementation in Java
    static class CQueue {
        int SIZE = 5; // Size of Circular Queue
        int front, rear;
        int items[] = new int[SIZE];

        CQueue() {
            front = -1;
            rear = -1;
        }

        // Check if the queue is full
        boolean isFull() {
            if (front == 0 && rear == SIZE - 1)
                return true;
            // if ends meet? what the fuck does this part mean?
            if (front == rear + 1)
                return true;
            return false;
        }

        // Check if the queue is empty
        boolean isEmpty() {
            if (front == -1)
                return true;
            else
                return false;
        }

        // Adding an element
        void enQueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1)
                    front = 0;
                // in circular queues, insertion can be done at both ends.
                // rear value is normal until its value is close to SIZE. in this case, it's 4, because the value of SIZE is 5. if the value of rear is < 4, then nothing special happens and it is inserted normally. but if rear is 4, then (4 + 1) % 5 = 0, and 0 is the first element of the queue. in short, it ends up at the front because it is a circular queue.
                rear = (rear + 1) % SIZE;
                items[rear] = element;
                System.out.println("Inserted " + element);
            }
        }

        // Removing an element
        int deQueue() {
            int element;
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                element = items[front];
                if (front == rear) {
                    front = -1;
                    rear = -1;
                } /* Q has only one element, so we reset the queue after deleting it. */
                else
                    // same logic as the rear thing above from enQueue()
                    front = (front + 1) % SIZE;
                return element;
            }
        }

        void display() {
        /* Function to display status of Circular Queue */
            int i;
            if (isEmpty()) {
                System.out.println("Empty Queue");
            } else {
                System.out.println("Front -> " + front);
                System.out.print("Items -> ");
                for (i = front; i != rear; i = (i + 1) % SIZE)
                    System.out.print(items[i] + " ");
                System.out.println(items[i]);
                System.out.println("Rear -> " + rear);
            }
        }
    }

    public static void main(String[] args) {

        CQueue q = new CQueue();

        // Fails because front = -1
        q.deQueue();

        q.enQueue(10);
        q.enQueue(12);
        q.enQueue(37);
        q.enQueue(6);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(16);

        q.display();

        int elem = q.deQueue();

        if (elem != -1)
            System.out.println("Deleted Element is " + elem);

        q.display();

        q.enQueue(7);

        q.display();
    }
}