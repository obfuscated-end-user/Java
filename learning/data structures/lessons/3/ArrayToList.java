import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {
        //Creating Array
        Integer[] arrayNum = {1, 2, 3, 4, 5};

        // Printing Array elements
        System.out.print("Array Elements: ");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }

        // Converting ArrayNum to List using for each-loop
        List<Integer> list = new ArrayList<>();
        for (int x : arrayNum) {
            list.add(x);
        }
        System.out.println("\nList Elements: " + list);
    }
}