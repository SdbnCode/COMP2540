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
/*psuedocode for insertion sort

input = an array
output = sorted array

for an array of i < size of array
    temp <- array[i]
    firstp = i - 1
    while firstp >= 0 and array[firstp] > temp
    array[firstp + 1] = array[firstp]
    firstp decrement
array[j+1] = temp
 */

}
