package recursion.array;

public class RBSRecursion {

    public static void main(String args[]){
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(search(arr, 1, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e){
        //base case
        if (s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[s]<=arr[mid]){
            if (arr[s]<=target && target<=arr[mid]){
                return search(arr, target, s, mid-1);
            }else {
                return search(arr, target, mid+1, e);
            }
        }
        if (arr[e]>=target && target>=arr[mid]){
                return search(arr, target, mid+1, e);
            }
        return search(arr, target, s, mid-1);
    }
}
