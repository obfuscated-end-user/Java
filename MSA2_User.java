// Problem 2. Create a program that will allow the user to select a stack operation such as insert, pop, peek, display and to re-run the program or to exit as outputted below:

/*
Sample output

run:
Enter the maximum size of the stack: 5
Please press any number from the following stack operations:
1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack
1
Please enter the element to insert = 1 2 3 4 5

Want to continue? y or n
y
Please press any number from the following stack operations:
1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack
4
Elements in Stack are:
5 4  3 2 1
Want to continue? y or n
y
Please press any number from the following stack operations:
1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack
2
Element popped from the list

Want to continue? y or n
y
Please press any number from the following stack operations:
1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack
4
Elements in Stack are:
4 3 2 1
Want to continue? y or n
y
Please press any number from the following stack operations:
1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack
3
Topmost element in Stack is: 4

Want to continue? y or n
n
BUILD SUCCESSFUL (total time: 2 minutes 6 seconds)
*/

import java.util.Scanner;

public class MSA2_User {
	int stack[];
	int maxSize;
	int top;

	boolean isEmpty() {
		return top < 0;
	}

	MSA2_User(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
	}

	boolean push(int x) {
		if (top >= (maxSize - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			stack[++top] = x;
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = stack[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = stack[top];
			return x;
		}
	}

	int get(int index) {
		return stack[index];
	}

	void print() {
		for (int i = 0; i < maxSize; ++i)
			System.out.print(stack[i] + " ");
	}

	public static void main(String[] args) {
		// variable declaration
		Scanner s = new Scanner(System.in);
		String cont = "y";  // continue is a keyword

		System.out.print("Enter the maximum size of the stack: ");
		int maxStackSize = s.nextInt();
		MSA2_User stack = new MSA2_User(maxStackSize);

		while (cont.equals("y")) {
			System.out.println("Please press any number from the following stack operations:");
			System.out.println("1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack");
			int choice = s.nextInt();

			if (choice == 1) {
				System.out.println("Please enter the elements to insert: ");
				for (int i = 0; i < maxStackSize; ++i)
					stack.push(s.nextInt());
			} else if (choice == 2) {
				if (stack.isEmpty())
					System.out.println("Stack is empty");
				else {
					stack.pop();
					maxStackSize -= 1;
					System.out.println("Element popped from the list");
				}
			} else if (choice == 3) {
				if (stack.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Topmost element in Stack is: " + stack.peek());
			} else if (choice == 4) {
				if (stack.isEmpty())
					System.out.println("Stack is empty");
				else {
					System.out.println("Elements in the stack are: ");
					for (int i = 0; i < maxStackSize; ++i)
						System.out.print(stack.get(i) + " ");
					System.out.println();
				}
			} else
				break;
			System.out.println("Want to continue? y or n: ");
			cont = s.next();
		}
		s.close();
	}
}
