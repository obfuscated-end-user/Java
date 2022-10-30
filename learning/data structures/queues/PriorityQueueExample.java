import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    static class CustomerOrder implements Comparable<CustomerOrder> {
        private int orderId;
        private double orderAmount;
        private String customerName;

        public CustomerOrder(int orderId, double orderAmount, String customerName) {
            this.orderId = orderId;
            this.orderAmount = orderAmount;
            this.customerName = customerName;
        }

        // most of these are overloaded functions
        // compareTo() is from the Comparable interface. what it does is that it sorts by ascending order. yeah great fucking explanation here dumbass, really detailed as shit bro.
        public int compareTo(CustomerOrder o) {
            return o.orderId > this.orderId ? 1 : -1;
        }

        // gets called when a string representation is needed. in this case, to appear on the terminal
        public String toString() {
            return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
        }

        public double getOrderAmount() {
            return orderAmount;
        }
    }
    public static void main(String[] args) {
        CustomerOrder c1 = new CustomerOrder(1, 7000.0, "Yvan");
        CustomerOrder c2 = new CustomerOrder(3, 3000.0, "Vryx");
        CustomerOrder c3 = new CustomerOrder(2, 5000.0, "Josie");
        CustomerOrder c4 = new CustomerOrder(2, 2000.0, "Kiko");
        CustomerOrder c5 = new CustomerOrder(2, 3500.0, "Verna");

        Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        customerOrders.add(c4);
        customerOrders.add(c5);
        // poll() removes the head (front) of the queue
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
    }
}