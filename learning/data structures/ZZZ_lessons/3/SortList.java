import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		// Creating a list of fruits
		List<String> list1 = new ArrayList<String>();

		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");

		// Sorting the list
		System.out.println("Sorting string...");
		Collections.sort(list1);

		// Traversing list through the for-each loop
		for (String i : list1)
			System.out.println(i);
		System.out.println("Sorting numbers...");

		// Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(70);
		list2.add(40);
		list2.add(100);
		list2.add(30);

		// Sorting the list
		Collections.sort(list2);

		// Traversing list through the for-each loop
		for (int i : list2)
			System.out.println(i);
	}
}