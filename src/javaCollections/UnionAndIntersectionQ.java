package javaCollections;

import java.util.HashSet;

public class UnionAndIntersectionQ {
    public static void main(String args[]) {
        int[] arr1 = {3, 4, 5, 5, 7,8};
        int[] arr2 = {3, 4, 5, 5};
        HashSet<Integer> set = new HashSet<>();
        unionArr(set, arr1, arr2);
        System.out.println(set);
        intersection(set, arr1, arr2);
        System.out.println(set);

    }

    private static void intersection(HashSet<Integer> set, int[] arr1, int[] arr2) {
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                set.remove(arr2[i]);
            }
        }

    }

    private static void unionArr(HashSet<Integer> set, int[] arr1, int[] arr2) {
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
    }
}
