public class Main {
    public static boolean BracketCheck(String arithmeticOperation) throws StackFullException, EmptyStackException {

        ArrayStack stack = new ArrayStack(arithmeticOperation.length());

        for (char c : arithmeticOperation.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if (!areBracketsMatching(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Balanced if the stack is empty
    }
    private static boolean areBracketsMatching(char open, char close) {
        return (open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')');
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "(9*[3*{[(3+3)/5]*7}])",
                "((3*(9-(4*(6-5))))",
                "{3*(2+[3-[4/[6/9]]]})",
                "{2-{3*{6/[[[(((9-0)))]]]}}/7"
        };

        for (String testCase : testCases) {
            boolean result = false;
            try {
                result = BracketCheck(testCase);
            } catch (StackFullException | EmptyStackException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Arithmetic operation: " + testCase);
            System.out.println("Brackets are balanced: " + result);
            System.out.println();
        }
    }
}
