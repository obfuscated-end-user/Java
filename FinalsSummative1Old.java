import java.util.Arrays;
import java.util.Scanner;

public class FinalsSummative1Old {
	public static void main(String[] args) {
		int size = 0;	// Size of array (grid) to be defined by user input
		int ctr = 0;	// Counter that will be used for loops later
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for the size of the grid: ");

		// The user will input an integer to determine the size of the grid.
		// A try-catch block is used to prevent unwanted values.
		while (true) {
			try {
				size = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.print("Enter a valid input value: ");
				sc.nextLine();
			}
		}
		size = (size < 1) ? 0 : size;

		// Create a two-dimensional array.
		int[][] grid = new int[size][size];
		// Temporary array to be used for holding values later.
		int tempArray[] = new int[size];
		// Close the scanner.
		sc.close();

		// Put random values (0 or 1) into the two-dimensional array.
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = (int) (Math.random() * 2);

		// Show the array generated on the console.
		System.out.println("\nGrid: ");
		if (size < 1)
			System.out.println("(none)");
		else {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++)
					System.out.print(grid[i][j] + " ");
				System.out.println();
			}
		}

		// Draws a line on the console to separate the array
		// from the Summary of the Data.
		for (int i = 0; i < size; i++) System.out.print("--");
		System.out.println();

		// Summaries based on the generated values from the array.
		// Check if the values in each row are equal or not.
		System.out.println("Summary of the Data:\nROWS");
		for (int i = 0; i < grid.length; i++) {
			if (Arrays.stream(grid[i]).distinct().count() == 1) {
				if (grid[i][0] == 1)
					System.out.println("\t- Row " + (i + 1) + " are all ones.");
				else
					System.out.println("\t- Row " + (i + 1)
										+ " are all zeroes.");
			} else
				ctr++;
		}
		if (ctr == size)
			System.out.println("\t- Rows do not have equal numbers.");
		ctr = 0;

		// Check if the values in each column are equal or not.
		System.out.println("COLUMNS");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++)
				tempArray[j] = grid[j][i];
			if (Arrays.stream(tempArray).distinct().count() == 1) {
				if (tempArray[0] == 1)
					System.out.println("\t- Column " + (i + 1) 
										+ " are all ones.");
				else
					System.out.println("\t- Column " + (i + 1) 
										+ " are all zeroes.");
			} else
				ctr++;
		}
		if (ctr == size)
			System.out.println("\t- Columns do not have equal numbers.");
		ctr = 0;

		/*
		First diagonal pattern. Starts from the top left to the bottom right.
			X 0 0 0
			0 X 0 0
			0 0 X 0
			0 0 0 X
		*/
		System.out.println("1ST DIAGONAL");
		for (int i = 0; i < grid.length; i++)
			tempArray[i] = grid[i][i];
		if (Arrays.stream(tempArray).distinct().count() == 1) {
			if (tempArray[0] == 1)
				System.out.println("\t- 1st diagonal are all ones.");
			else
				System.out.println("\t- 1st diagonal are all zeroes.");
		} else
			ctr++;
		if (ctr == 1)
			System.out.println("\t- 1st diagonal does not have equal numbers.");
		ctr = 0;

		/*
		Second diagonal pattern. Starts from the top right to the bottom left.
			0 0 0 X
			0 0 X 0
			0 X 0 0
			X 0 0 0
		*/
		System.out.println("2ND DIAGONAL");
		for (int i = 0, j = grid.length - 1; j > -1; i++, j--)
			tempArray[i] = grid[i][j];
		if (Arrays.stream(tempArray).distinct().count() == 1) {
			if (tempArray[0] == 1)
				System.out.println("\t- 2nd diagonal are all ones.");
			else
				System.out.println("\t- 2nd diagonal are all zeroes.");
		} else
			ctr++;
		if (ctr == 1)
			System.out.println("\t- 2nd diagonal does not have equal numbers.");
		ctr = 0;
	}
}