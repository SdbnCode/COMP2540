import java.util.Scanner;

public class MergeSortedQueues {
    public static void mergeQueues(Queue result, Queue left, Queue right) {

        while (!left.isEmpty() && !right.isEmpty()) {
            if ((int) left.front() <= (int) right.front()) {
                result.enqueue(left.dequeue());
            } else {
                result.enqueue(right.dequeue());
            }
        }

        // Copy remaining elements from left and right queues if any
        while (!left.isEmpty()) {
            result.enqueue(left.dequeue());
        }

        while (!right.isEmpty()) {
            result.enqueue(right.dequeue());
        }
    }
}
