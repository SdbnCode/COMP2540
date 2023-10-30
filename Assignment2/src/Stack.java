 public class Stack {
        private LinkedList stack;
        private int top;

        public Stack() {
            stack = new LinkedList();
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(Object element) {
            top = top + 1;
            stack.addFirst(element);
        }


        public Object pop() {
            if (isEmpty()) {
                return("Stack is Empty");
            } else {
                return stack.removeFirst();
            }
        }

        public Object top() {
            if (isEmpty()) {
                return ("Stack is Empty");
            } else {
                return stack.getFirst();
            }
        }

        public Object size() {
            return stack.size();
        }
    }
