package recursion;

public class SumofDigit {
    public static void main(String args[]){
        System.out.println(sumOfDigit(1234 ));
    }
    public static int sumOfDigit(int n){
        //base case
        if (n==0){
            return 0;
        }
        return n%10 + sumOfDigit(n/10);
    }

}
