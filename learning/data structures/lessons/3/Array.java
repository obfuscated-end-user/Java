// removing the fucking package declaration makes it work

// package lessons;

public class Array {
    public static void main(String[] args) {
        //creating an array of integer type
        int arr[] = new int[4];

        //adding elements into array
        arr[0] = 7;
        arr[1] = 2;
        arr[2] = 15;
        arr[3] = 67;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
