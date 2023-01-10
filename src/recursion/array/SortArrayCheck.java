package recursion.array;

public class SortArrayCheck {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3,3, 4, 5, 6};
        System.out.println(checkArraySort(arr, 0));
    }

    private static boolean checkArraySort(int[] arr, int index) {
        //base case
        if (index==arr.length-1){
            return true;
        }
        return arr[index] <= arr[index+1] && checkArraySort(arr, index+1);
//        if (arr[n] <= arr[n+1]) {
//            return checkArraySort(arr, n+1);
//        } else{
//            return false;
//        }
    }

}

