
public class QuickSort {

    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        //one element sort case
        if (lowIndex >= highIndex) {
            return;
        }
        //Set the last number in the array as the pivot
        int pivot = array[highIndex];
        int leftPointer = partition(array,lowIndex,highIndex,pivot);

        //recursive call of the quickSort method for left partition
        quickSort(array, lowIndex, leftPointer - 1);
        //recursive call of quickSort for right size of the partition
        quickSort(array, leftPointer + 1, highIndex);
    }

    //Partition method
    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        //Starting at the left most number
        int leftPointer = lowIndex;
        //Starting from the right most number
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            //When we have a left pointer larger than pivot and right pointer smaller than pivot, we swap the numbers.
            swap(array, leftPointer, rightPointer);
        }
        //When the right and left meet, we swap the pivot with the left pointer.
        if(array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }
        return leftPointer;
    }

    //Swap function
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    //Overloading of quickSort
    public static void quickSort(int[] array){
        quickSort(array,0, array.length - 1);
    }

}