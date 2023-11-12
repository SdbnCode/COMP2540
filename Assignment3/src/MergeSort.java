public class MergeSort {

    public static void mergeSort(Queue queue) {
        //Length of queue
        int inputSize = queue.size();

        // Queue that is already sorted
        if (inputSize < 2) {
            return;
        }

        //find the middle index
        int midIndex = inputSize / 2;

        // Create left and right queues
        Queue left = new Queue();
        Queue right = new Queue();

        // Populate the left queue up until the middle index
        for (int i = 0; i < midIndex; i++) {
            left.enqueue(queue.dequeue());
        }

        // Populate the right queue with the rest of the elements
        for (int i = midIndex; i < inputSize; i++) {
            right.enqueue(queue.dequeue());
        }

        // Recursive call for left half and right half to merge to sort the halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted left and right queues
        MergeSortedQueues.mergeQueues(queue,left,right);
    }


}
