package recursion;

public class CountZero {
    public static void main(String args[]){
        countZero(123450 );
        System.out.println(sum);
    }

    public static int sum=0;
    public static void countZero(int n){
        //base case
        if (n==0){
            return;
        }
        if (n%10==0){
            sum++;
        }
        countZero(n/10);
    }

}
