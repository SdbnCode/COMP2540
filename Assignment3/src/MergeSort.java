public class MergeSort {

    public static void mergeSort(Queue queue) {
        int inputSize = queue.size();

        // Queue that is already sorted
        if (inputSize < 2) {
            return;
        }

        int midIndex = inputSize / 2;

        // Create left and right queues
        Queue left = new Queue();
        Queue right = new Queue();

        // Populate the left queue
        for (int i = 0; i < midIndex; i++) {
            left.enqueue(queue.dequeue());
        }

        // Populate the right queue
        while (!queue.isEmpty()) {
            right.enqueue(queue.dequeue());
        }

        // Recursive call for left half and right half to merge
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted left and right queues
        MergeSortedQueues.mergeQueues(queue,left,right);
    }


}
