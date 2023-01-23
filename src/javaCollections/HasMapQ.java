package javaCollections;

import java.util.HashMap;

// find requency of no. greater than n/3
public class HasMapQ {
    public static void main(String args[]){
        int[] arr = {3,4,5,5,5,3,4,3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i= 0; i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        for (int key : map.keySet()){
            if (map.get(key)> arr.length/3){
                System.out.println(key +"  "+ map.get(key));
            }
        }

    }
}
