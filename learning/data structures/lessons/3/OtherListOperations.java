import java.util.*;
public class OtherListOperations {
    public static void main(String[] args) {
        // creating an instance of ArrayList
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(17);
        list1.add(2);
        list1.add(15);
        list1.add(67);

        // iteration over ArrayList using for-each loop
        for(Integer f : list1) {
            System.out.print(f + " ");
        }

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(23);
        list2.add(9);
        list2.add(5);

        // print the size of list again
        System.out.println("\n Size of list after adding more elements:" + list1.size());

        // remove a specific element
        list1.remove(3);

        // addAll method - add list1 to list2
        list1.addAll(list2);

        // remove the content of index 3 and print all the element in  list1 and list2
        System.out.println("List after addAll:"+ list1);

        // contains method
        if (list2.contains(10) == true)
            System.out.println("The list2 contains 10");
        else
            System.out.println("The list does not contain the value of 10");

        // containsAll method
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(20);
        list3.add(150);
        if (list1.containsAll(list3) == true)
            System.out.println("List1 contains values 2 and 15");
        else
            System.out.println("The list does not contain the value of 2 and 15");

        // use equals method to check equality with each list to other
        if (list1.equals(list2) == true)
            System.out.println("\nlist1 and list2 are equal.\n");
        else
            System.out.println("list1 and list2 are not equal.\n");

        // access list elements using index with get () method
        System.out.println("Element at index 0:" + list1.get(0));
        System.out.println("Element at index 1:" + list1.get(1));
        System.out.println("Element at index 2:" + list1.get(2));

        // set element at index 1 to 1000
        list1.set(1,1000);
        System.out.println("Element at list1 index 1 was changed to :" + list1.get(1) );
        list1.addAll(list2);
        System.out.println("List after addAll:"+ list1);

        // remove all the elements in the list
        list1.clear();
        System.out.println("\nList after calling clear() method:" + list1);
    }
}