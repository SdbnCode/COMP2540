import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

  /*      int [] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //For insertion sort method
        System.out.println("Array before sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        InsertionSort.insertionSort(array);

        System.out.println("Array after sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

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
        }*/

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

                // Assuming you have implemented the mergeSort method in the MergeSort class
                MergeSort.mergeSort(myQueue);

                System.out.println("Sorted Queue: ");
                while (!myQueue.isEmpty()) {
                    System.out.print(myQueue.dequeue() + " ");
                }
            }
        }

