package recursion;

public class BS {

    static int binarySearch(int[] arr, int target, int s, int e){
        //base case
        if (s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            return binarySearch(arr, target, s, mid-1);
        }
        return binarySearch(arr, target, mid+1, e);
    }
    public static void main(String args[]){
        int[] arr = {3,5,9,23,45,67,78,89};
        int target=3;
        System.out.println(binarySearch(arr,target, 0, arr.length-1));

    }
}
