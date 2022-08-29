import java.util.Scanner;

public class MidtermEnabling1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // make a new array
        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = input.nextInt();
        int[] array = new int[numberOfElements];

        // put elements in the array
        for (int index = 0; index < array.length; ++index)
            array[index] = input.nextInt();

        // print all elements of the array
        System.out.print("The elements are: ");
        for (int index = 0; index < array.length; ++index) {
            if (index == array.length - 1)
                System.out.print(array[index]);
            else
                System.out.print(array[index] + ", ");
        }
        System.out.println();

        // search for desired element
        System.out.println("What is the element to be searched?");
        int elementToSearch = input.nextInt();
        boolean found = false;

        for (int index = 0; index < array.length; ++index) {
            if (array[index] == elementToSearch) {
                System.out.println("The element " + elementToSearch +
                                    " is found at index " + index + ".");
                found = true;
            }
        }

        // if element is not in array
        if (!found)
            System.out.println("The element is not found in the array.");

        // sum of the elements
        int sum = 0;
        for (int index = 0; index < array.length; ++index)
            sum += array[index];
        System.out.println("The sum of the elements is: " + sum);

        // average value of the elements
        double average = (double) sum / numberOfElements;
        System.out.println("The average value of the elements is: " + average);

        // close the scanner
        input.close();
    }
}