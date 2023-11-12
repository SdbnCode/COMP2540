import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
     /*   //For insertion sort method
        System.out.println("Array before sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        InsertionSort.insertionSort(array);

        System.out.println("Array after sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }*/
/*

        // Merge sort method with queue
        Queue myQueue = new Queue();

        myQueue.enqueue(10);
        myQueue.enqueue(9);
        myQueue.enqueue(8);
        myQueue.enqueue(7);
        myQueue.enqueue(6);
        myQueue.enqueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);


        System.out.println("Original Queue: \n" + myQueue);

        MergeSort.mergeSort(myQueue);

        System.out.println("Sorted Queue: ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.dequeue() + " ");
        }
*/

        //Quick sort method
        System.out.println("Array before sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        QuickSort.quickSort(array);

        System.out.println("Array after sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        /*
        Insertion sort:
        worst case = O(n^2) - If the array is completely reversed then it will need to compare every single element and swap in every iteration of the inner loop
        best case = O(n) - If the array is already sorted then it just needs to go through the array one time
        average case = O(n^2)

        Quick sort:
        worst case = O(n^2) - This happens when the pivot is splitting the array into really unbalanced partitions then the partition is going to keep going at a n-1 rate
        best = O(n log n) - If the pivot is always producing even partitions then it is possible to get this best case
        average case = O(n log n)

        Merge sort:
        worst case = O(n log n) - because it uses recurssion and implements a linear search
        best case = O(n log n) - at any level merge is dividing and combining the array from two parts which has a time complexity of n and then the recursion part would be n/2 as it takes half the time to sort then bam you have n log n
        average case = O(n log n) - its a stable algorithm compared to the other two
         */

        }
    }


