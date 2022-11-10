import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] nums = { 8, 2, 4, 1, 6, 3, 7, 9, 5 };
        SortedSet<Integer> treeSet = new TreeSet<>(Arrays.asList(nums));
        // Print first and last element
        System.out.println("Print the first element--> " + treeSet.first());
        System.out.println("Print the last element--> " + treeSet.last());
        System.out.println("Print all the elements");
        printAll(treeSet);
        // False. Set does not allow duplicates,
        // so this will not be added.
        System.out.println(treeSet.add(1));
        // But, this will be added because 11 is not a duplicate
        System.out.println(treeSet.add(11));
        printAll(treeSet);
        // prints elements less than 6, but not including 6. remember, the list is sorted.
        printAll(treeSet.headSet(6));
    }
    public static void printAll(SortedSet<Integer> tree) {
        for (int s : tree) {
            System.out.print(" " + s);
        }
        System.out.println();
    }
}