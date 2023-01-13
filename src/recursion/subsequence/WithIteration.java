package recursion.subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithIteration {

    public static void main(String args[]){
        int[] arr ={2,1,2};
        List<List<Integer>> list = subseqIteration(arr);
        for (List l : list){
            System.out.println(l);
        }
        System.out.println();
        List<List<Integer>> listD = subseqDuplicate(arr);
        for (List l : listD){
            System.out.println(l);
        }


    }

    private static List<List<Integer>> subseqIteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
               int sizeOfOuter = outer.size();
               for (int i=0; i<sizeOfOuter; i++){
                  List<Integer> internal = new ArrayList<>(outer.get(i));
                  internal.add(num);
                  outer.add(internal);
            }
        }
        return outer;
    }

    private static List<List<Integer>> subseqDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end =0;
        for (int i=0; i<arr.length; i++){
            //if current and previous element is same , start = end +1
            if (i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int sizeOfOuter = outer.size();
            for (int j=start; j<sizeOfOuter; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
