import java.util.Stack;

public class Pop {
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

        // Remove elements from the stack
        String delete = names.pop();
        System.out.println("Stack: " + names);
    }
}

// variable delete not actually used in the example