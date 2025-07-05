import java.util.Arrays;
import java.util.Scanner;

public class FEA {
	public static void odd(int array[], int index) {
		if (index > array.length - 1)
			return;
		if (array[index] % 2 != 0)
			System.out.println(array[index]);
		odd(array, index + 1);
	}

	public static void even(int array[], int index) {
		if (index > array.length - 1)
			return;
		if (array[index] % 2 == 0)
			System.out.println(array[index]);
		even(array, index + 1);
	}

	public static void main(String[] args) {
		// enter the number of elements in the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];

		// enter the array elements
		System.out.println("Enter array elements:");
		for (int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		sc.close();

		// print the elements on the screen
		System.out.println("\nElements: " + Arrays.toString(array).replaceAll("\\[", "").replaceAll("\\]",""));

		// start at index 0
		System.out.println("\nOdd numbers:");
		odd(array, 0);
		System.out.println("\nEven numbers:");
		even(array, 0);
	}
}

/*
algorithm (use recursion):
enter the number of elements in the array x
enter the array elements x
print the elements on the screen x
print the odd numbers then the even numbers, with the smallest values first separated by newlines x
*/