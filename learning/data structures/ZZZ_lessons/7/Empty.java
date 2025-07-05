import java.util.Stack;

public class Empty {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();

		// Add elements to the stack
		names.push("Kiko");
		names.push("Vanj");
		names.push("Yvan");
		names.push("Vryx");
		names.push("Prince");
		names.push("Princess");
		System.out.println("Stack: " + names);

		// Check if stack is empty
		boolean empty = names.empty();
		System.out.println("Is the stack empty?: " + empty); 
	}
}

// variable name is capitalized in the actual example