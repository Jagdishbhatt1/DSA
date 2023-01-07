package recursion;

public class CountZero2 {
    public static void main(String args[]){
        countZero(12300450, 0);
        System.out.println();
    }

    //public static int sum=0;
    public static void countZero(int n, int count){
        //base case
        if (n==0){
            System.out.println(count);
            return;
        }
        if (n%10==0){
            count++;
        }
        countZero(n/10, count);
    }

}
