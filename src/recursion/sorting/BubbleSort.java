package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {3,4,5,2,1,9,6};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        sortRecursion(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.toString(sortRecursion(arr,arr.length-1, 0)));
//      int[] sortedArr = sortRecursion(arr,arr.length-1, 0);
//      for(int i=0; i<sortedArr.length; i++){
//          System.out.print(sortedArr[i]+" ");
//      }
    }

    private static void sortRecursion(int[] arr, int length, int itr) {
        //base case
        if (length==0){
            return;
        }
        if (length>itr){
            if (arr[itr]>arr[itr+1]){
                //swap
                int temp = arr[itr];
                arr[itr] = arr[itr+1];
                arr[itr+1] = temp;
            }
             sortRecursion(arr, length, itr+1);
        } else {
             sortRecursion(arr,length-1,0);
        }
    }
}
