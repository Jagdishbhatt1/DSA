package leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){

        int[] nums ={1,2,3,6};
        int target = 5;
       int[] result = twoSum(nums, target);
        //System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));

      /* for (int n : result){
           System.out.print(n);
       }*/
    }

        public static int[] twoSum2(int[] nums, int target) {
            HashMap<Integer, Integer> prevMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int diff = target - num;

                if (prevMap.containsKey(diff)) {
                    return new int[] { prevMap.get(diff), i };
                }

                prevMap.put(num, i);
            }

            return new int[] {};
        }




    //Time complexity: O(n2)

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i!=j && nums[i]+nums[j]==target){
                    output[0]= i;
                    output[1]= j;
                    return output;
                }
            }
        }
        return output;
    }
}
