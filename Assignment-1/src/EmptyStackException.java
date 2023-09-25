public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Custom Stack Empty Exception: The stack is empty.");
    }

    public EmptyStackException(String message) {
        super(message);
    }
}