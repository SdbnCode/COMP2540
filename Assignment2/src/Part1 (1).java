
public class Part1 {

    public static void BracketMatch(String element) {
        Stack stack = new Stack();

        for (char currentSymbol : element.toCharArray()) {
            if (currentSymbol == '(' || currentSymbol == '{' || currentSymbol == '[') {
                stack.push(currentSymbol);
            } else if (currentSymbol == ')' || currentSymbol == '}' || currentSymbol == ']') {
                if (stack.isEmpty()) {
                    System.out.println("No matching bracket with " + currentSymbol + " bracket");
                    return;
                }
                char openingSymbol = (char) stack.pop();
                if (!((openingSymbol == '(' && currentSymbol == ')') ||
                        (openingSymbol == '{' && currentSymbol == '}') ||
                        (openingSymbol == '[' && currentSymbol == ']')))
                {
                    System.out.println("Wrong type of bracket matched");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Every bracket matched");
            System.out.println(stack.top());
        } else {
            System.out.println("Some symbols were never matched");
            System.out.println(stack.top());
            System.out.println(stack.isEmpty());
            System.out.println(stack.size());
        }
    }

    public static void main(String[] args) {
        BracketMatch("(9*[3*{[(3+3)/5]*7}])");
    }
}