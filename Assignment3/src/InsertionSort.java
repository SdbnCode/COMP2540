public class InsertionSort {
    public static void insertionSort(int[] input){

        for(int i = 1; i < input.length; i++){
            int currentTemp = input[i];
            //reference to first position
            int j = i - 1;
            //walks back number until either we hit the beginning of the array or we get to the value we want to insert at
            while(j >=0 && input[j] > currentTemp){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = currentTemp;
        }
    }


}
