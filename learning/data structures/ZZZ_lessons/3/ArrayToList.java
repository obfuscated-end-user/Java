import java.util.*;

public class ArrayToList {
	public static void main(String[] args) {
		// Creating Array
		Integer[] arrayNum = {1, 2, 3, 4, 5};
		int[] arrayNum2 = {1, 2, 3, 4, 5};  // i don't know how this is any different

		// Printing Array elements
		System.out.print("Array Elements: ");
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}

		// Converting ArrayNum to List using for each-loop
		List<Integer> list = new ArrayList<>();
		for (int x : arrayNum) {
			// doesn't really convert anything. you're only appending the elements of arrayNum to the end of the list.
			list.add(x);
		}
		System.out.println("\nList Elements: " + list); // you can print a list directly into the console
		System.out.println("List Elements: " + arrayNum); // you can do this but it will only show a memory address thing
		System.out.println("List Elements: " + arrayNum2);  // same as this
	}
}