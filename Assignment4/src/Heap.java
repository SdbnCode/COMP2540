public class Heap {

    private int[] heap;
    private int size;
    private int maxSize;
    private static final int ROOT = 1;

    public Heap(int i) {
        this.maxSize = i;
        this.size = 0;

        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    //finding parent method
    private int parent(int index) {
        return index / 2;
    }

    private int getLeftChild(int index) {
        return (index * 2);
    }

    private int getRightChild(int index) {
        return (index * 2) + 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return heap.length == 0;
    }

    private boolean isLeaf(int index) {
        if (index > (size / 2)) {
            return true;
        }
        return false;
    }
    public void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    //runtime of O(log n)
    public void minHeapSort(int index) {
        // Check if the current node is not a leaf
        if (!isLeaf(index)) {
            int swapIndex = index;
            // Check if the right child exists
            if (getRightChild(index) <= size) {
                // Compare the left and right children to determine the swap index
                if (heap[getLeftChild(index)] < heap[getRightChild(index)]) {
                    swapIndex = getLeftChild(index);
                } else {
                    swapIndex = getRightChild(index);
                }
            } else {
                swapIndex = getLeftChild(index);
            }
            // Check if swapping is necessary to maintain the min-heap property
            if (heap[index] > heap[getLeftChild(index)] || heap[index] > heap[getRightChild(index)]) {
                swap(index, swapIndex);
                // Recursively call minHeapSort on the swapped index
                minHeapSort(swapIndex);
            }
        }
    }
    //runtime of O(n)
    public void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        heap[++size] = element;
        int current = size;
        int parent = parent(current);
        while (current > 1 && heap[current] < heap[parent]) {
            swap(current, parent);
            current = parent;
            parent = parent(current);
        }
    }
    //runtime of O(n log n)
    public void removeMin() {
        int deleted = heap[ROOT];
        heap[ROOT] = heap[size--];
        minHeapSort(ROOT);
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" Parent: " + heap[i] + " Left: " + heap[2 * i] + " Right:" + heap[2 * i + 1]);
            System.out.println();
        }
    }
}
