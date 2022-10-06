import java.util.Stack;

public class Search {
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

        // Search an element from the stack
        int index = names.search("Vanj");
        System.out.println("Position of Vanj is in index: " + index); 
    }
}