import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
	public static double evaluate(String expression) {
		Scanner scanner = new Scanner(expression);
		Stack<Double> operands = new Stack<Double>();

		while (scanner.hasNext()) {
			if (scanner.hasNextDouble()) { // i.e., operand was seen
				operands.push(scanner.nextDouble());
			} else { // i.e., an operator was seen
				String operator = scanner.next();
				double operand1 = operands.pop();
				double operand0 = operands.pop();

				switch (operator) {
					case "+": operands.push(operand0 + operand1); break;
					case "-": operands.push(operand0 - operand1); break;
					case "*": operands.push(operand0 * operand1); break;
					case "/": operands.push(operand0 / operand1); break;
					case "^": operands.push(Math.pow(operand0, operand1)); break;
				}
			}
			// debug
			System.out.println(operands);
		}
		scanner.close();
		return operands.pop();
	}

	public static void main(String[] args) {
		System.out.println("Enter a postfix expression:");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		scanner.close();
		System.out.println(PostfixEvaluation.evaluate(inputStr));
	}
}