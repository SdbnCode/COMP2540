

public class Part2 {
        public static boolean contextFree(String n) {
            Stack stack = new Stack();

            for (int i = 0; i < n.length(); i++) {
                char currentChar = n.charAt(i);
                if (currentChar == '0') {
                    // Push '0' onto the stack
                    stack.push('0');
                } else if (currentChar == '1') {
                    // Check if the stack is empty
                    if (stack.isEmpty()) {
                        return false; // If it's empty, the string is not in the language
                    } else {
                        // Pop '0' from the stack
                        stack.pop();
                    }
                } else {
                    // If the input contains characters other than '0' and '1', it's not in the language
                    return false;
                }
            }

            // If the stack is empty after processing the entire string, it's in the language
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String input = "0101"; // Change this to your input string
            if (contextFree(input)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}

