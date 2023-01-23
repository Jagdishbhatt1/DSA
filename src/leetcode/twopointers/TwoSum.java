package leetcode.twopointers;

import java.util.Arrays;

public class TwoSum {

        public static void main(String args[]){

            System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4,5}, 5)));
        }


        public static int[] twoSum(int[] numbers, int target) {
            int a_pointer = 0;
            int b_pointer = numbers.length - 1;
            int num_a, num_b;

            while (a_pointer < b_pointer) {
                num_a = numbers[a_pointer];
                num_b = numbers[b_pointer];

                if (num_a + num_b == target) break;

                if (num_a + num_b < target) {
                    a_pointer++;
                    continue;
                }

                b_pointer--;
            }

            return new int[] { a_pointer + 1, b_pointer + 1 };
        }


}
