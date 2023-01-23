
public class Array {
    public static void main(String args[]) {
        int[] arr = {0, 1, 1, 0, 0,1};
        sortArr(arr);
        for(int i : arr) {
            System.out.print(i);
        }
    }
    //Put all 0's left and all 1's right
    private static void sortArr(int[] arr) {
        int f=0;
        for (int i=0; i<arr.length; i++){
            if (arr[f]==0){
                f++;
            } else if(i!=f && arr[i]==0){
                int tmp= arr[i];
                arr[i]=arr[f];
                arr[f]=tmp;
                f++;
            }


        }
    }
}
