import java.util.*;

// list iterator
// can't rename file as ListIterator.java
public class HasNextPrevious {
    public static void main(String[] args) {
        List<Integer> ite = new ArrayList<Integer>();
        ite.add(100);
        ite.add(200);
        ite.add(150);
        ite.add(300);

        // List iterator is used to traverse all types of list
        ListIterator<Integer> val = ite.listIterator();

        System.out.println("Traversing elements in forward direction");
        while (val.hasNext()) {
            System.out.println("index:"+val.nextIndex() + " " +val.next());
        }

        System.out.println("Traversing elements in backward direction");
        while (val.hasPrevious()) {
            System.out.println("index: " + val.previousIndex() + " " + val.previous());
        }
    }
}