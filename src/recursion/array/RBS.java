package recursion.array;

public class RBS {
    public static void main(String args[]){
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(rotatedArrayBS(arr, 4));
    }

    private static int rotatedArrayBS(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            //left or right side sorting check
            if (arr[l] <= arr[mid])
                if (target >= arr[l] && target <= arr[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;

                }
            else {
                if (target <= arr[h] && target >= arr[mid]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
        }
        return -1;
    }
}
