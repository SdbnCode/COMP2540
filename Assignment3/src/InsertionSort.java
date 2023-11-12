public class InsertionSort {
    public static void insertionSort(int[] input){

        for(int i = 1; i < input.length; i++){
            //put the current value into a temporary array
            int currentTemp = input[i];
            //reference the position next to i on the left
            int j = i - 1;
            /*walks back number until either we hit the beginning of the array
            or we get to the value greater than or equal to the current value
            */
            while(j >= 0 && input[j] > currentTemp){
                //moves the variable out of the spot we want
                input[j+1] = input[j];
                //moves left
                j--;
            }
            //inserting the value that we want at the location we saved
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
