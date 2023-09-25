public class StackFullException extends Exception {
    public StackFullException() {
        super("The stack is full.");
    }

    public StackFullException(String message) {
        super(message);
    }
}
