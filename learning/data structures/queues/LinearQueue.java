// user-defined linear queue
public class LinearQueue {
    int SIZE = 5;
    // uses a list here for representation
    int items[] = new int[SIZE];
    // front is the item at the left side, rear at the right side (in this case)
    // remember that these two are indices, not the values in the queue themselves
    int front, rear;

    // -1 means empty in this context. having an index of 0 is like the first element of the list, which you know already.
    LinearQueue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        // if there is an element on the front (being 0), and if the rear is equal to the maximum size, then the queue is full, otherwise, not full. makes sense if the rear is less than the maximum size.
        if (front == 0 && rear == SIZE - 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        // if there is no front index, then queue is empty. no need to do shit with the rear.
        if (front == -1)
            return true;
        else
            return false;
    }

    // add an item to a queue. equivalent to pushing an element on a stack.
    void enQueue(int element) {
        // if queue is full, don't do anything
        if (isFull())
            System.out.println("Queue is full");
        else {
            // REMEMBER: front and rear are used for indices, not for the values of the queue
            // if the queue is initially empty, set the value of front to be 0 to prevent out of bounds errors
            if (front == -1)
                front = 0;
            // since we're enqueueing (adding) an element, we increment the value of the rear by one
            rear++;
            // in this context, items[front] and items[rear] would do the same thing, but items[rear] makes more sense since we're adding an element to the rear end, not the front end.
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        // temporary variable
        int element;
        // return nothing if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            // set the value of the variable element to that of the front element of the queue
            element = items[front];
            // front and rear are index values. this simply means that if front ends up being greater than or equal to rear, means that there are no more elements at the front. like, no longer 0
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                // it looks like that front acts like a pointer here. we're not shifting the elements from the rear end to the front end for some reason. we're only moving the front pointer to the next in the list. interesting. like, the element at index 0 is still there, but can't be accesed anymore since front is now 1.
                front++;
            }
            System.out.println("Deleted -> " + element);
            return element;
        }
    }

    // you know, displays the list using a for loop. self-explanatory.
    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.print("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to because the queue is full
        q.enQueue(6);
        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();
    }
}