package recursion;

public class Reverse2 {
    public static void main(String args[]){
        System.out.println(reverse(123456));
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
}
