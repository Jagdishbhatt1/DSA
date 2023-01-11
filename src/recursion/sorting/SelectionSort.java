package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]){
        int[] arr = {3,6,8,9,1,2,5,7};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.print(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int length, int index, int largest) {
        //base case
        if (length==0){
            return;
        }

        if (index<length){
            if (arr[index]>arr[largest]) {
                largest = index;
            }
                selectionSort(arr, length, index+1, largest);
        } else {
            //swap
            int tmp= arr[length];
            arr[length]= arr[largest];
            arr[largest]= tmp;
            selectionSort(arr, length-1,0,0);
        }
    }

}
