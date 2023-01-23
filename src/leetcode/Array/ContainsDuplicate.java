package leetcode.Array;


import java.util.HashSet;

// Time complexity: O(n)
// Space complexity: O(n)
public class ContainsDuplicate {

        public static void main(String args[]){
            int[] nums ={1,2,2,3,4};
            System.out.println(containsDuplicate(nums));
        }

    public static boolean containsDuplicate(int[] nums) {
            // Create a hashset...
            HashSet<Integer> hset = new HashSet<Integer>();
            // Traverse all the elements through the loop...
            for (int idx = 0; idx < nums.length; idx ++){
                // Searches hashset. if present, it contains duplicate...
                if (hset.contains(nums[idx])){
                    return true;
                }
                // if not present it will update hashset...
                hset.add(nums[idx]);
            }
            // Otherwise return false...
            return false;
        }

        // Time complexity: O(n^2)
        // Space complexity: O(1)
    public static boolean containsDuplicate2(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }

        }
        return false;
    }
    }




