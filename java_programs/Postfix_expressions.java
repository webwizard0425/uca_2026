import java.util.Stack;

public class Postfix_expressions {

    public static int evaluatePostfix(String expression) {

        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            // If token is a number
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            }

            // If token is an operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "3 1 * 2 + 9 -";

        System.out.println(evaluatePostfix(expression));
    }
}
