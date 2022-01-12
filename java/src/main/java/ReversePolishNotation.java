import java.util.Stack;

public class ReversePolishNotation {

    public int eval(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            try {
                stack.push(Integer.parseInt(token));
            }
            catch (NumberFormatException e){
                Integer b = stack.pop();
                Integer a = stack.pop();
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
}
