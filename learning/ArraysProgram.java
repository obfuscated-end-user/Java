import java.util.Arrays;

public class ArraysProgram {
    public static void main(String args[])  {
        /*
        arrays
        type[] arrayName = new type[size];
        type[] arrayName = {};

        multidimensional arrays
        type[][] arrayName = new type[size][size];
        type[][] arrayName = {{}}; i assume?
        */

        // regular array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("The array is " + numbers.length + " items long");

        // multidimensional array used in a for loop
        int[][] multiDimensionalNumbers = new int[10][10];
        for (int i = 0; i < multiDimensionalNumbers.length; i++) {
            for (int j = 0; j < multiDimensionalNumbers[i].length; j ++) {
                System.out.print("| " + i + "" + j + " ");
            }
            System.out.println();
        }
    }
}
