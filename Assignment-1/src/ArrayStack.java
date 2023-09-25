public class ArrayStack {

    private final int[] stack;
    private int top;
    private final int maxSize = 100;

    public ArrayStack(int length) {
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int x) throws StackFullException {
        if (isFull()) {
            throw new StackFullException();
        } else {
            top = top + 1;
            stack[top] = x;
        }
    }

    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int popped = stack[top];
            top = top - 1;
            return popped;
        }
    }

    public int top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[top];
        }
    }

    public int size() {
        return top + 1;
    }
}
