package recursion.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]){
        int[] arr = {4,7,2,9,1,8,3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

//               Arrays.sort(arr);
//               System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int s= low;
        int e = high;
        //int mid = s + (e-s)/2; // taking pivot middle element
        int pivot = arr[e]; // pivot end of element

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
