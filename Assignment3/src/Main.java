import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

/*
        //Array before calling insertion method
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
*/
        //Array before calling quicksort method
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
    }
}