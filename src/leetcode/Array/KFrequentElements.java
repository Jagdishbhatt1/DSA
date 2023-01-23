package leetcode.Array;

import java.util.*;

public class KFrequentElements {
    public static void main(String args[]){
        int[] arr = {1,1,1,2,3,3,4,4,4,5};
        int[] result = frequentElement(arr, 3);
        System.out.println(Arrays.toString(result));
       /* for (int i: result){
            System.out.println(i);
        }*/
       // topKFrequent(arr, 4);

    }

    public static void topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        System.out.println(Arrays.toString(arr));
    }


    public static int[] frequentElement(int[] arr, int k){
        if(arr.length ==0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i =0; i< arr.length; i++){

            if(map.containsKey(arr[i])){
                map.compute(arr[i], (K,V) -> V+1);
            } else{
                map.put(arr[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> itr : map.entrySet()){
            pq.add(itr);
            if (pq.size()>k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        while (!pq.isEmpty()){
            result[--k]= pq.poll().getKey();
        }

        //System.out.println(pq);

        return result;
    }
}

