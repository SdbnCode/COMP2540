public class Part2 {
    public static String recognizeLanguage(String x) throws FullStackException {

        ArrayStack stack = new ArrayStack(x.length());

        for (char character : x.toCharArray()) {
            if (character == '0') {
                stack.push(0);
            } else if (character == '1') {
                try {
                    int top = stack.pop();
                    if (top != 0) {
                        return "No";
                    }
                } catch (EmptyStackException e) {
                    return "No";
                }
            }
        }

        if (stack.isEmpty()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) throws FullStackException {
        String[] testCases = {
               /* "01",
                "0011",
                "000111",
                "10",
                "00",
                "111",
                "1100",
                "0101"*/
                ""
        };

        for (String testCase : testCases) {
            String result = recognizeLanguage(testCase);
            System.out.println("Input String: " + testCase);
            System.out.println("Does it fit the language: " + result);
            System.out.println();
        }
    }
}

