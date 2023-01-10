package recursion.array;

import java.util.ArrayList;

public class find {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 3, 4, 5,4, 6};
        System.out.println(findTarget(arr, 3, 0));
        System.out.println(findIndex(arr, 3, 0));
        System.out.println(findIndexFromLast(arr, 3, arr.length-1));
        findAllIndex(arr, 3, 0);
        System.out.println(list);
        findAllIndex2(arr, 3, 0, new ArrayList());
        System.out.println(list);
        System.out.println(findAllIndex3(arr, 4, 0));
    }

    private static boolean findTarget(int[] arr, int target, int index) {
        //base case
        if (index==arr.length){
            return false;
        }
       // return arr[index] == target || findTarget(arr, target, index+1);
        if (arr[index] == target) {
             return true;
        } else{
            return findTarget(arr, target, index+1);
        }
    }

    private static int findIndex(int[] arr, int target, int index) {
        //base case
        if (index==arr.length){
            return -1;
        }
        // return arr[index] == target || findTarget(arr, target, index+1);
        if (arr[index] == target) {
            return index;
        } else{
            return findIndex(arr, target, index+1);
        }
    }

    private static int findIndexFromLast(int[] arr, int target, int index) {
        //base case
        if (index==-1){
            return -1;
        }
        // return arr[index] == target || findTarget(arr, target, index+1);
        if (arr[index] == target) {
            return index;
        } else{
            return findIndexFromLast(arr, target, index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static void findAllIndex(int[] arr, int target, int index) {
        //base case
        if (index==arr.length){
            return;
        }
        // return arr[index] == target || findTarget(arr, target, index+1);
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    //ArrayList in argument
    private static ArrayList findAllIndex2(int[] arr, int target, int index, ArrayList list) {
        //base case
        if (index==arr.length){
            return list;
        }
        // return arr[index] == target || findTarget(arr, target, index+1);
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }

    //ArrayList not in argument
    private static ArrayList findAllIndex3(int[] arr, int target, int index) {
       ArrayList<Integer> list = new ArrayList<>();
        //base case
        if (index==arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> indexFromBelow = findAllIndex3(arr, target, index+1);
        list.addAll(indexFromBelow);
        return list;
    }

}

