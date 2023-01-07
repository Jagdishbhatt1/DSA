package recursion;

public class Palindrome {
    public static void main(String args[]){
        System.out.println(palindrome(121));
    }

    private static int reverse(int n) {
        //base case
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        int digit = (int)(Math.log10(n))+1;
        int base= (int)Math.pow(10,digit-1);
        return (rem*base) + reverse(n/10);
    }
    public static boolean palindrome(int n){
        return n==reverse(n);
    }
}
