package leetcode.Array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Product of Array Except Self
public class ProductExceptSelf {

public static void main(String args[]){
    int[] arr = {1,2,3,4};
    System.out.println(Arrays.toString(productExceptSelf2(arr)));
}



// O(n^2)
    public static int[] productExceptSelf(int[] nums) {
        int[] o = new int[nums.length];
        int p= 1;
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(i!=j){
                    p = p*nums[j];
                }
            }
            o[i] = p;
            p=1;
        }
        return o;
    }

    //O(n)

    public static int[] productExceptSelf2(int[] nums) {
        int p = 1;
        int[] o = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            p *= nums[i];
        }
        for(int i=0; i<nums.length; i++){
            o[i]= p/nums[i];
        }
        return o;
        }

    }
